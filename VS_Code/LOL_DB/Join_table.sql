SELECT tier_list.id, 
    kda_info.name,
    tier_list.lank,  
    victory_info.victory,
    tier_list.tier
FROM tier_list
INNER JOIN kda_info 
ON tier_list.id = kda_info.id 
INNER JOIN victory_info
ON kda_info.id = victory_info.id;