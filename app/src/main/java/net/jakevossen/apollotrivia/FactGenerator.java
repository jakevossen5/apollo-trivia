package net.jakevossen.apollotrivia;

import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jake on 6/16/2017.
 */
public class FactGenerator {
    InputStream inputStream;

    public FactGenerator(){ };
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Facts genFacts(){
        //vars
        Facts facts = new Facts();
        ArrayList<String> answerList = new ArrayList<>();
        String question;
        int answerIndex;
        String explanation;
        String source;
        //generic question
        /*
        //new question
        answerList.clear();
        question = "";

        answerList.add("");
        answerList.add("");
        answerList.add("");
        answerList.add("");

        answerIndex = 0;
        explanation = "";
        source = "";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

         */

        //new question
        question = "What year did humans first go to the moon?";

        answerList.add("1969");
        answerList.add("1977");
        answerList.add("1970");
        answerList.add("1982");

        answerIndex = 0;
        explanation = "The first humans on the moon was 1969.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();

        question = "What were the first words spoken on the moon?";

        answerList.add("...one small step for a man, one giant leap for mankind");
        answerList.add("The pledge of allegiance");
        answerList.add("The preamble of the constitution");
        answerList.add("Not known, the radio data failed");

        answerIndex = 0;
        explanation = "\"...one small step for a man, one giant leap for mankind\" were the first words on the moon, spoken my Niel Armstrong. He claims he siad \"...one small step for a man, AND ONE giant leap for mankind\", but the radio did not pick up on it.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What was the first Apollo Mission?";

        answerList.add("Apollo 1");
        answerList.add("Apollo 0");
        answerList.add("Apollo 11");
        answerList.add("Apollo 10");

        answerIndex = 0;
        explanation = "Apollo 1 was the first mission";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/index.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "When was the tragedy of the Apollo 1 mission?";

        answerList.add("Jan. 27, 1967");
        answerList.add("Jul. 14, 1966");
        answerList.add("Dec. 2, 1968");
        answerList.add("May 29, 1968");

        answerIndex = 0;
        explanation = "Jan. 27, 1967 was the day that a preflight test killed Virgil Grissom, Edward White, and Roger Chaffee";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo1.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What is the name of the rocket primarily used in the Apollo missions?";

        answerList.add("Saturn");
        answerList.add("Falcon");
        answerList.add("Atlas");
        answerList.add("Delta");

        answerIndex = 0;
        explanation = "Saturn were the rockets primarily used during the Apollo missions.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo1.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What mission contained the first Saturn V launch?";

        answerList.add("Apollo 4");
        answerList.add("Apollo 1");
        answerList.add("Apollo 11");
        answerList.add("Apollo 10");

        answerIndex = 0;
        explanation = "Apollo 4 was the first to fly the Saturn V rocket";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo1.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What year was the first Saturn rocket launched?";

        answerList.add("1967");
        answerList.add("1963");
        answerList.add("1965");
        answerList.add("1969");

        answerIndex = 0;
        explanation = "1967 was the first time the Saturn V rocket flew";
        source = "https://www.nasa.gov/audience/forstudents/5-8/features/nasa-knows/what-was-the-saturn-v-58.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "How heavy is the Saturn V rocket fully fueled?";

        answerList.add("2.8 million kilograms");
        answerList.add(".9 million kilograms");
        answerList.add("8.1 million kilograms");
        answerList.add("4.2 million kilograms");

        answerIndex = 0;
        explanation = "Fully fueled for liftoff, the Saturn V weighed 2.8 million kilograms (6.2 million pounds).";
        source = "https://www.nasa.gov/audience/forstudents/5-8/features/nasa-knows/what-was-the-saturn-v-58.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "How tall is the Saturn V rocket?";

        answerList.add("111 meters");
        answerList.add("314 meters");
        answerList.add("72 meters");
        answerList.add("161 meters");

        answerIndex = 0;
        explanation = "The Saturn V rocket was 111 meters tall";
        source = "https://www.nasa.gov/audience/forstudents/5-8/features/nasa-knows/what-was-the-saturn-v-58.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "How many elephants does the Saturn V rocket weigh when it is fully fueled?";

        answerList.add("400");
        answerList.add("120");
        answerList.add("1000");
        answerList.add("650");

        answerIndex = 0;
        explanation = "The Saturn V rocket weighed about 400 elephants when it was fueled for takeoff.";
        source = "https://www.nasa.gov/audience/forstudents/5-8/features/nasa-knows/what-was-the-saturn-v-58.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "How many pounds of thrust did the Saturn V produce at launch?";

        answerList.add("34.5 million newtons");
        answerList.add("133.2 million newtons");
        answerList.add("12.8 million newtons");
        answerList.add("72.1 million newtons");

        answerIndex = 0;
        explanation = "The saturn V generated 34.5 million newtons(7.6 million pounds) of thrust at launch, which is more than 85 Hoover Dams.)";
        source = "https://www.nasa.gov/audience/forstudents/5-8/features/nasa-knows/what-was-the-saturn-v-58.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "When was the launch of Apollo 7?";

        answerList.add("Oct. 11, 1968");
        answerList.add("Feb. 2, 1966");
        answerList.add("Aug. 20, 1969");
        answerList.add("Jul. 21, 1968");

        answerIndex = 0;
        explanation = "Apollo 7 was launched on Oct. 11, 1968; 11:02:45 a.m. EST";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What launch complex did the Apollo 7 mission use?";

        answerList.add("Launch Complex 34");
        answerList.add("Launch Complex 40");
        answerList.add("Launch Complex 41");
        answerList.add("Launch Complex 37A");

        answerIndex = 0;
        explanation = "Apollo 7 was launched at Launch Complex 34";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What was the size of orbit of the Apollo 7 mission?";

        answerList.add("141 miles");
        answerList.add("212 miles");
        answerList.add("180 miles");
        answerList.add("334 miles");

        answerIndex = 0;
        explanation = "The orbit of Apollo 7 was 140 by 183 miles";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What was the point of keeping the S-IVB part of the craft in orbit with them in the Apollo 7 mission?";

        answerList.add("So they could simulate docking");
        answerList.add("It contained nessesary food and supplies");
        answerList.add("They didn't want too, the jetison failed");
        answerList.add("It was part of a science equitment that they needed");

        answerIndex = 0;
        explanation = "They used the jettision part of the ship to simulate docking, a nessesary part of the lunar mission";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "How did the engine preform on the Apollo 7 mission?";

        answerList.add("Nearly perfectly");
        answerList.add("Incredibly poorly, and it was difficult to return from orbit");
        answerList.add("Acceptable, but could have been better");
        answerList.add("Bad, but not bad enough that it caused issues.");

        answerIndex = 0;
        explanation = "There were eight nearly perfect firings out of eight attempts";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "How long did the Apollo 7 capsule stay in orbit?";

        answerList.add("10.8 days");
        answerList.add("8.1 days");
        answerList.add("3.2 days");
        answerList.add("5.9 days");

        answerIndex = 0;
        explanation = "Apollo 7 was in orbit for 10.8 days";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What was one of the medical issues the astronauts expeced once Apollo 7";

        answerList.add("A bad cold");
        answerList.add("Dehydration");
        answerList.add("Eyesight issues from the sun");
        answerList.add("Skin issues");

        answerIndex = 0;
        explanation = "About 15 hours into the flight, Schirra developed a bad cold, and Cunningham and Eisele soon followed suit. A cold is uncomfortable enough on the ground, but in weightlessness it presents a different problem. Mucus accumulates, fills the nasal passages and does not drain from the head. The only relief is to blow hard, which is painful to the ear drums. So the crew of Apollo 7 whirled through space suffering from stopped-up ears and noses.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What was the landing spot of Apollo 7?";

        answerList.add("27 degrees, 32 minutes north, and 64 degrees, four minutes west");
        answerList.add("31 degrees, 19 minutes north, and 44 degrees, 12 minutes west");
        answerList.add("25 degrees, 40 minutes north, and 66 degrees, 52 minutes west");
        answerList.add("12 degrees, 23 minutes north, and 12 degrees, 44 minutes west");

        answerIndex = 0;
        explanation = "Apollo's flotation bags had their first try out when the spacecraft, considered a \"lousy boat,\" splashed down in the Atlantic southeast of Bermuda, less than 2 kilometers from the planned impact point. Landing location was 27 degrees, 32 minutes north, and 64 degrees, four minutes west. The module turned upside down, but when inflated, the brightly colored bags flipped it upright.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What time did the astronauts on Apollo 7 return to the ship?";

        answerList.add("8:20 a.m. EDT");
        answerList.add("2:20 a.m. EDT");
        answerList.add("9:15 p.m. EDT");
        answerList.add("3:36 p.m. EDT");

        answerIndex = 0;
        explanation = "The crew arrived at 8:20 a.m. EDT";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo7.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //APOLLO 8

        //new question
        answerList.clear();
        question = "Who was the Commander of the Apollo 8 mission?";

        answerList.add("Frank Borman");
        answerList.add("Neil Armstrong");
        answerList.add("William A. Anders");
        answerList.add("Edwin E. Aldrin Jr.");

        answerIndex = 0;
        explanation = "The commander of the Apollo 8 mission was Frank Borman";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "When was the launch of Apollo 8?";

        answerList.add("Dec. 21, 1968");
        answerList.add("Mar. 28, 1967");
        answerList.add("Oct. 3, 1968");
        answerList.add("Jul. 14, 1968");

        answerIndex = 0;
        explanation = "Apollo 8 launched at Dec. 21, 1968; 7:51 a.m. EST";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "How long was the burn that set Apollo 8 to the moon?";

        answerList.add("Five-minute, 17-seconds");
        answerList.add("Two-minute, 45-seconds");
        answerList.add("Eight-minute, 30-seconds");
        answerList.add("Three-minute, 22-seconds");

        answerIndex = 0;
        explanation = "Apollo 8 launched at Dec. 21, 1968; 7:51 a.m. EST";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "When did the loss of signal occor during the Apollo 8 mission when the austronauts went behind the moon?";

        answerList.add("68 hours, 58 minutes, 45 seconds ");
        answerList.add("40 hours, 9 minutes, 32 seconds ");
        answerList.add("81 hours, 36 minutes, 22 seconds ");
        answerList.add("33 hours, 21 minutes, 19 seconds ");

        answerIndex = 0;
        explanation = "Loss of signal occurred at 68 hours, 58 minutes, 45 seconds when Apollo 8 passed behind the moon. At that moment, NASA's three astronauts became the first humans to see the moon's far side.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "How long did the first Lunar orbit insertion burn last on the Apollo 8 mission?";

        answerList.add("Four minutes, two seconds");
        answerList.add("Six minutes, eight-seconds");
        answerList.add("Nine-minute, 30-seconds");
        answerList.add("Two-minute, 59-seconds");

        answerIndex = 0;
        explanation = "The first lunar orbit insertion burn, at 69 hours, 8 minutes, 52 seconds, lasted four minutes, two seconds and reduced the spacecraft's 8,400 feet per second velocity by 2,994 feet per second";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What was the size of the orbit around the moon on the Apollo 8 mission?";

        answerList.add("70 miles");
        answerList.add("12 miles");
        answerList.add("112 miles");
        answerList.add("44 miles");

        answerIndex = 0;
        explanation = "The orbit circularized at 70 miles by the second lunar orbit insertion burn of 135 feet per second, performed at the start of the third revolution, again on the back side of the moon";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "On Christmas eve, what message did the Apollo 8 astronauts brodcast home?";

        answerList.add("Merry Christmas, as well as verces from the book of Genesis in the Bible");
        answerList.add("A call to more science in the education system");
        answerList.add("Endorcment of a political cannadent");
        answerList.add("A call to follow your country");

        answerIndex = 0;
        explanation = "During a telecast on Christmas Eve, the crew read verses from the first chapter of Genesis and wished viewers, \"Good night, good luck, a Merry Christmas and God bless all of you - all of you on the good Earth.\"";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What was the re-entry velocity of Apollo 8";

        answerList.add("24,696 mph");
        answerList.add("62,471 mph");
        answerList.add("13,942 mph");
        answerList.add("44,326 mph");

        answerIndex = 0;
        explanation = "The re-entry velocity was 24,696 mph.";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What was the re-entry heat on the heatsheild of Apollo 8";

        answerList.add("5,000 degrees F");
        answerList.add("15,000 degrees F");
        answerList.add("8,000 degrees F");
        answerList.add("2,000 degrees F");

        answerIndex = 0;
        explanation = "The heatshield withstood teampatures of 5,000 degrees F";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What was the re-entry heat on the heatsheild of Apollo 8";

        answerList.add("5,000 degrees F");
        answerList.add("15,000 degrees F");
        answerList.add("8,000 degrees F");
        answerList.add("2,000 degrees F");

        answerIndex = 0;
        explanation = "The heatshield withstood teampatures of 5,000 degrees F";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));

        //new question
        answerList.clear();
        question = "What was the re-entry heat on the heatsheild of Apollo 8";

        answerList.add("5,000 degrees F");
        answerList.add("15,000 degrees F");
        answerList.add("8,000 degrees F");
        answerList.add("2,000 degrees F");

        answerIndex = 0;
        explanation = "The heatshield withstood teampatures of 5,000 degrees F";
        source = "https://www.nasa.gov/mission_pages/apollo/missions/apollo8.html";

        facts.addFact(new Fact(question,answerList,answerIndex,explanation,source));


        //end
        return facts;
    }

}
