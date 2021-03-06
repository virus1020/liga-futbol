<?php

/**
 *
 * Create a round robin of teams or numbers
 *
 * @param    array    $teams
 * @return    $array
 *
 */
 function roundRobin( array $teams ){

    if (count($teams)%2 != 0){
        array_push($teams,"bye");
    }
    $away = array_splice($teams,(count($teams)/2));
    $home = $teams;
    for ($i=0; $i < count($home)+count($away)-1; $i++)
    {
        for ($j=0; $j<count($home); $j++)
        {
            $round[$i][$j]["Home"]=$home[$j];
            $round[$i][$j]["Away"]=$away[$j];
        }
        if(count($home)+count($away)-1 > 2)
        {
            $s = array_splice( $home, 1, 1 );
            $slice = array_shift( $s  );
            array_unshift($away,$slice );
            array_push( $home, array_pop($away ) );
        }
    }
    return $round;
}
?>

<?php

// create an array of teams
$members = array('Atletico','Cantera','Piskinis','Reencuentro','Dep.Juvenil','Catalanes','Colmena','Primos','Crew','Unites','Manchester','Bayern');

// do the rounds
$rounds = roundRobin($members);

$table = "<table>\n";
foreach($rounds as $round => $games){
    $table .= "<tr>
                <th></th>
                <th style='text-align:center;'>Jornada:".($round+1)."</th>
                </tr>\n";
    foreach($games as $play){
       $table .= "<tr>
                  <td style='color:blue;'>".$play["Home"]."</td>
                  <td style='color:red;'>VS</td>
                  <td style='color:green;'>".$play["Away"]."</td>
                  </tr>\n";
    }
}
$table .= "</table>";



echo $table;
?>