import java.io.*;
class WorldOfPages
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
String [] Fiction={"Animal Farm- George Orwell", "1984- George Orwell", "Neverwhere- Neil Gaiman", "Among the Hidden- Margaret Peterson Haddix", "The Iron Man- Ted Hughes", "A Clockwork Orange- Anthony Burgess", "Congo- Michael Crichton", "The Handmaid’s Tale- Margaret Atwood", "Fahrenheit 451- Ray Bradbury", "Doctor on the Boil- Richard Gordon", "Great Medical Mysteries- Richard Gordon", "Next- Michael Crichton", "Micro- Michael Crichton", "Stardust- Neil Gaiman", "Matilda- Roald Dahl", "The BFG- Roald Dahl", "The Witches- Roald Dahl", "The Twits- Roald Dahl", "Danny the Champion of the World- Roald Dahl", "Fantastic Mr. Fox- Roald Dahl", "Vampire Academy- Richelle Mead", "Frostbite- Richelle Mead", "Shadow Kiss- Richelle Mead", "Blood Promise- Richelle Mead", "Spirit- Bound- Richelle Mead", "Last Sacrifice- Richelle Mead", "Hunger Games- Suzanne Collins", "Catching Fire- Suzanne Collins", "Mockingjay- Suzanne Collins"};
Double [] PrFic={79.00, 149.00, 249.00, 199.00, 149.00, 99.00, 299.00, 89.00, 299.00, 199.00, 249.00, 139.00, 139.00, 249.00, 99.00, 89.00, 99.00, 89.00, 99.00, 89.00, 199.00, 239.00, 249.00, 249.00, 249.00, 299.00, 299.00, 349.00, 399.00};
String [] Sciencef={"Isaac Asimov’s Science Fiction Treasury- Isaac Asimov", "Bicentennial Man- Isaac Asimov", "Nemesis- Isaac Asimov", "Foundation- Isaac Asimov", "Prelude to Foundation- Isaac Asimov", "Foundation’s Edge- Isaac Asimov", "Second Foundation- Isaac Asimov", "Foundation and Empire- Isaac Asimov", "I- Robot- Isaac Asimov", "The Rest of the Robots- Isaac Asimov", "The Ultimate Hitchhiker’s Guide to Galaxy- Douglas Adams", "The Selfish Gene- Richard Dawkins", "Jurassic Park- Michael Crichton", "The Restaurant at the End of the Universe- Douglas Adams", "So Long", "And Thanks For All the Fish- Douglas Adams", "Brocas’ Brain: Reflections on the Romance of Science- Carl Sagan", "The Doom Machine- Mark Teague", "Brave New World- Aldous Huxley", "The Lost World-  Sir Arthur Conan Doyle", "Life", "the Universe and Everything- Douglas Adams", "Mostly Harmless- Douglas Adams", "Songs of Distant Earth- Arthur C. Clarke", "Prey- Michael Crichton", "Planet of the Apes- Pierre Boulle", "Artemis Fowl (Set)- Eoin Colfer", "Northern Lights- Philip Pullman", "The Subtle Knife- Philip Pullman", "The Amber Spyglass- Philip Pullman"};
Double [] PrScifi={349.00, 299.00, 249.00, 199.00, 149.00, 199.00, 219.00, 249.00, 239.00, 199.00, 149.00, 299.00, 249.00, 99.00, 119.00, 139.00, 149.00, 189.00, 199.00, 129.00, 299.00, 129.00, 249.00, 129.00, 1099.00, 249.00, 289.00, 299.00, 299.00, 319.00};
String [] Historicalf={"Redfield Farm: A Novel of the Underground Railroad- Judith Redline Coopey", "Dunaway’s Crossing- Nancy Brandon", "Eye of the Needle- Ken Follett", "Chanakya’s Chant- Ashwin Sanghi", "Rozabal Line- Shawn Haigins and Ashwin Sanghi", "Angels and Demons- Dan Brown", "The Lost Symbol- Dan Brown", "Da Vinci Code- Dan Brown", "The Stolen Crown: The Secret marriage That Forever Changed the Fate of England- Susan Higginbotham", "Rebekah’s Journey- Ann Bell"};
Double [] PrHisf={99.00, 139.00, 149.00, 199.00, 249.00, 199.00, 214.00, 249.00, 299.00, 199.00};
String [] MDCrime={"The Invention of Hugo Cabret- Brian Selznick", "Congo- Michael Crichton", "The Curious Incident of the Dog in the Night Time- Mark Haddon", "The Long Dark Tea- Time of the Soul- Douglas Adams", "Boom!- Mark Haddon", "State of Fear- Michael Crichton", "Digital Fortress- Dan Brown", "Perfect Crime- Jack Erickson", "Watch Me Die- Lee Goldberg", "The Mysterious Affair at Style- Agatha Christie", "The Secret Adversary- Agatha Christie", "And Then There Were None- Agatha Christie", "Murder on the Orient Express- Agatha Christie", "The Mystery of the Blue Train- Agatha Christie", "The Murder on the Links- Agatha Christie", "Taken at the Flood- Agatha Christie", "Death in the Clouds- Agatha Christie", "The Labors of Hercules- Agatha Christie", "The Hollow- Agatha Christie", "The Murder of Roger Ackroyd- Agatha Christie", "Daeth on the Nile- Agatha Christie", "Mrs. McGinty’s Dead- Agatha Christie", "The A. B. C Murders- Agatha Christie", "Dead Man’s Folly- Agatha Christie", "Dumb Witness- Agatha Christie", "Five Little Pigs- Agatha Christie", "Cards on the Table- Agatha Christie", "Sherlock Homes (Single Volume)- Arthur Canon Doyle", "Three Cheers Secret Seven- Enid Blyton", "Fun for the Secret Seven- Enid Blyton", "Good Old Secret Seven- Enid Blyton", "Well Done, Secret Seven- Enid Blyton", "Secret Seven Fireworks- Enid Blyton", "Go Ahead Secret Seven- Enid Blyton", "Good Work Secret Seven- Enid Blyton", "Secret Seven on the Trail- Enid Blyton", "Five Go Down to Sea- Enid Blyton", "Five Go to Smuggler’s Top- Enid Blyton", "Five on a Treasure Island- Enid Blyton", "Five Go to Demon Rocks- Enid Blyton", "Five Get into Trouble- Enid Blyton", "Five Go to Mystery Moor- Enid Blyton", "The Ruby in the Smoke- Philip Pullman", "The Shadow in the North- Philip Pullman", "The Tiger in the Well- Philip Pullman", "The Tin Princess- Philip Pullman"};
Double [] PrCri={159.00, 299.00, 89.00, 199.00, 99.00, 149.00, 249.00, 289.00, 239.00, 149.00, 119.00, 129.00, 149.00, 199.00, 199.00, 149.00, 199.00, 129.00, 119.00, 159.00, 189.00, 199.00, 149.00, 219.00, 129.00, 119.00, 99.00, 129.00, 899.00, 99.00, 99.00, 99.00, 99.00, 99.00, 99.00, 99.00, 99.00, 99.00, 99.00, 99.00, 99.00, 99.00, 99.00, 249.00, 249.00, 249.00};
String [] Horror={"Fragile Things- Neil Gaiman", "The Doll- J.C Martin", "Torment- Jeff Menapace", "A Walk in the Woods- Rebecca M. Senese", "Midnight Paths: A Collection of Dark Horror- Joe Hart", "The Final Winter- Mr. Ian Rob Wright", "Horrific Happenings: A Dark Horror Anthology- James Anthony", "The Accidental Exorcist- Joshua Graham", "House of Leaves- Mark Z. Danielewski", "Deadlocked- A. R Wise", "The Woods of Red Hill- Shaun Whittington", "They- Vincent Hobbes", "Dead Heart- Brandon Ford", "House Guest- John Paul Allen", "Where Darkness Dwells: A Great Depression Horror Novel- Glen R. Krisch"};
Double [] PrHor={199.00, 149.00, 169.00, 99.00, 99.00, 129.00, 149.00, 199.00, 219.00, 249.00, 149.00, 199.00, 239.00, 269.00, 219.00};
String [] Fantasy={"Harry potter and the Sorcerer’s Stone- J. K. Rowling", "Harry potter and the Chamber of Secrets- J. K. Rowling", "Harry potter and the Prisoner of Azkaban- J. K. Rowling", "Harry potter and the Goblet of Fire- J. K. Rowling", "Harry potter and the Order of the Phoenix- J. K. Rowling", "Harry potter and the Half- Blood Prince- J. K. Rowling", "Harry potter and the Deathly Hallows- J. K. Rowling", "The Graveyard Book- Neil Gaiman", "A Game of Thrones- George R. R. Martin", "A Clash of Kings- George R. R. Martin", "A Storm of Swords- George R. R. Martin", "A Feast for Crows- George R. R. Martin", "A Dance with Dragons- George R. R. Martin", "The Winds of Winter- George R. R. Martin", "A Dream of Spring- George R. R. Martin", "Eragon- Christopher Paolini", "Eldest- Christopher Paolini", "Brisingr- Christopher Paolini", "Inheritance- Christopher Paolini", "Knights: The Eye of Divinity- Robert E. Keller", "The Black God’s War- Moses Siregar III", "The Thirteenth Unicorn- W. D. Newman", "The Book of Deacon- Joseph Lallo", "The Queen’s Blade- T. C. Southwell", "Demonsouled- Jonathan Moeller", "The Mind Readers- Lori Brighton", "Box of Runes: Epic Fantasy Collection- J. Thorn", "Draykon- Charlotte E. English", "Child of the Ghosts-  Jonathan Moeller", "Fantasy( Signature Select)- Lori Foster", "The Last Elf of Lanis- K. J. Hargan", "Dragon Blood- Anthony D. Franklin", "The Island- Michael Stark", "Clockwork Fairytale- Hellen Scott Taylor", "Clockwork Princess- Cassandra Clare", "Mistborn- Brandon Sanderson", "The Hero of Ages- Brandon Sanderson", "The Well of Ascension- Brandon Sanderson"};
Double [] PrFant={199.00, 199.00, 219.00, 299.00, 349.00, 299.00, 349.00, 139.00, 299.00, 319.00, 349.00, 349.00, 349.00, 399.00, 399.00, 249.00, 299.00, 349.00, 399.00, 299.00, 249.00, 239.00, 149.00, 199.00, 219.00, 299.00, 499.00, 99.00, 249.00, 99.00, 249.00, 239.00, 229.00, 199.00, 299.00, 299.00, 319.00, 349.00};
String [] Mythology={"Anansi Boys- Neil Gaiman", "American Gods- Neil Gaiman", "Heroes", "Gods and Monsters of the Greek Myths- Bernard Evslin", "Treasury of Greek Mythology- G. A. Buxton", "The Norse Myths( Pantheon Fairy Tale and Folklore Library)- Kevin Crossley- Holland", "Asgard Stories: Tales from Norse Mythology- Mary H. Foster", "100 Characters from Classical mythology: Greek and Roman- Malcolm Day", "Indian Mythology: Tales", "Symbols", "and Rituals from the Heart of the Subcontinent- Devdutt Pattanaik", "American Indian Myths and Legends- Richard Erdoes and Alfonso Ortiz", "The Ramayana (A Retelling )- Valmiki", "“Mahabharata” of Vyasa- P. Lal", "Percy Jackson and the Lightning Thief- Rick Riordan", "Percy Jackson and the Sea of Monsters- Rick Riordan", "Percy Jackson and the Curse of the Titans- Rick Riordan", "Percy Jackson and the Battle of the Labyrinth- Rick Riordan", "Percy Jackson and the Last Olympian- Rick Riordan", "The Lost Hero- Rick Riordan", "Son of Neptune- Rick Riordan", "The Mark of Athena- Rick Riordan", "The Red Pyramid- Rick Riordan", "The Throne of Fire- Rick Riordan", "The Serpent’s Shadow- Rick Riordan", "Egyptian Tales: The Complete Collection- W. M. Flinders Petrie", "Legends of he Gods: The Egyptian Texts", "Edited with translations- E. A. Wallis Budge"};
Double [] PrMyth={199.00, 199.00, 149.00, 249.00, 249.00, 259.00, 249.00, 249.00, 229.00, 299.00, 299.00, 199.00, 219.00, 249.00, 249.00, 249.00, 249.00, 319.00, 349.00, 299.00, 349.00, 399.00, 199.00, 249.00, 349.00, 349.00, 399.00, 399.00};
String [] Romance={"The Host- Stephenie meyer", "Dane- Liliana Hart", "Second Chance Romance- Asrai Devin", "Complications over Coffee- Asrai Devin", "Love Can’t Wait- Asrai Devin", "Intimate Strangers- Laura Taylor", "Take Me- Bella Andre", "Love Me- Bella Andre", "Crazy Love- Nicola Marsh", "Accidental Married To… A Vampire?- Mimi Jean Pamfiloff", "Twilight- Stephenie Meyer", "New Moon- Stephenie Meyer", "Eclipse- Stephenie Meyer", "Breaking Dawn- Stephenie Meyer", "Seducing Miss Dunaway- Kate Rothwell", "Bared to You: A Crossfire Novel- Sylvia Day", "All of You- Kelsey Maxwell", "All’s Fair in Love and Seduction- Beverley Kendall", "Right Fit Wrong Shoe- Varsha Dixit", "Wrong Means Right End- Varsha Dixit", "Xcess Baggage- Varsha Dixit"};
Double [] PrRom={199.00, 199.00, 149.00, 129.00, 189.00, 139.00, 199.00, 199.00, 189.00, 249.00, 299.00, 349.00, 399.00, 449.00, 199.00, 249.00, 149.00, 129.00, 249.00, 289.00, 239.00};
String [] Classics={"A Tale of Two Cities- Charles Dickens", "Jane Eyre- Charlotte Bronte", "The Scarlet Letter- Nathaniel Hawthorne", "Treasure island- Robert Louis Stevenson", "David Copperfield- Charles Dickens", "Little Women- Louisa May", "Pride and Prejudice- Jane Austen", "The Count of Monte Cristo- Alexandre Dumas", "Oliver Twist- Charles Dickens", "Jude the Obscure- Thomas Hardy", "The Raven and Other Writings- Edgar Allan Poe", "Charlotte’s Web- E. B. White", "Nicholas Nickleby- Charles Dickens", "Robin Hood of Sherwood- Ann Mcgovern", "The Wind in the Willows- Ellen Miles"};
Double [] PrClas={199.00, 199.00, 219.00, 249.00, 239.00, 199.00, 199.00, 149.00, 199.00, 149.00, 129.00, 149.00, 249.00, 239.00, 149.00};
String [] Comics={"The Revenge of the Baby- Sat- Bill Watterson", "The Calvin and Hobbes Tenth- Bill Watterson", "Yukon He!- Bill Watterson", "Something Under the Bed is Drooling- Bill Watterson", "The Days are Just Packed- Bill Watterson", "The Best of Laxman- R. K. Laxman", "Stories from the Panchatantra- Amar Chitra Katha", "Tales of Narada- Amar Chitra Katha", "Shivaji the Great Maratha- Amar Chitra Katha", "Ganesha- Amar Chitra Katha", "Shiva and Parvati: A Story of Divine Love- Amar Chitra Katha", "Stories of Krishna- Amar Chitra Katha", "Heroes from the Mahabharata- Amar Chitra Katha", "Jataka Tales- Amar Chitra Katha", "Stories from the Bhagawat Gita- Amar Chitra Katha", "Asterix at the Olympic Game- Rene Goscinny and Albert Uderzos", "Asterix and the Cheftain’s Shield- Rene Goscinny and Albert Uderzo", "Asterix and Caesar’s Gift- Rene Goscinny and Albert Uderzo", "Asterix and the Actress- Rene Goscinny and Albert Uderzo", "Asterix and Cleopatra- Rene Goscinny and Albert Uderzo", " Tintin in America- Herge", "Cigars of the Pharaoh- Herge", "The Blue Lotus- Herge", "The Broken Ear- Herge", "The Black Island- Herge", "King Ottokar’s Sceptre- Herge", "The Crab with the Golden Claws- Herge", "The Shooting Star- Herge", "The Secret of the Unicorn- Herge", "Great Marvel Collection- Roy Rockwood"};
Double [] PrCom={149.00, 149.00, 149.00, 149.00, 149.00, 399.00, 299.00, 249.00, 349.00, 199.00, 249.00, 249.00, 399.00, 299.00, 349.00, 149.00, 149.00, 149.00, 149.00, 149.00, 199.0, 199.0, 199.0, 199.0, 199.0, 199.0, 199.0, 199.0, 199.0, 149.00};
String [] SHumour={"The Restaurant at the End of the Universe- Douglas Adams", "The Animal Farm- George Orwell", "Brave New World- Aldous Huxley", "The Mancode: Exposed- Rachel Thompson", "Aunts Aren’t Gentlemen- P. G. Wodehouse", "Ruskin Bond’s Book of Humour- Ruskin Bond", "The Diary of a Social Butterfly- Moni Mohsin", "May I Hebb Yout Attention Pliss- Arnab Ray", "Duty Free- Moni Mohsin", "Tender Hooks- Moni Mohsin"};
Double [] PrHum={99.00, 79.00, 149.00, 199.00, 199.00, 249.00, 199.00, 199.00, 199.00, 219.00};
String [] MBiography={"Prisoner’s Dilemma- William Poundstone", "Surely You’re Joking", "Mr. Feynman!(Adventures of a Curious Character)- Richard P. Feynman", "The Boy Who Harnessed the Wind- William Kamkwamba", "The Motorcycle Diaries- Ernesto Che Guevara", "Steve Jobs- Walter Isaacson", "The Story of Walt Disney: Maker of Magical Worlds- Bernice Selden", "The Autobiography of Benjamin Franklin- Benjamin", "Ordinary Genius: the Story of Albert Einstein- Stephanie Sammartino McPherson", "The Story of My Experiments with Truth: Gandhi", "An Autobiography - Mohandas Karamchand Gandhi", "People: Gone Too Soon: Remembering 65 Celebrities Who Died Too Young- People Magazine"};
Double [] PrMB={219.00, 199.00, 249.00, 249.00, 299.00, 299.00, 319.00, 249.00, 349.00, 299.00, 349.00, 399.00};
String [] Poetry={"101 Great American Poems- The American Poetry and Literacy Project", "The Poetry of Robert Browning- Stopford A. Brooke", "Where the Sidewalk Ends- Shel Silverstein", "Poetry Young People: Robert Frost", "The Random House Book of Poetry for Children- Jack Pretlusky and Arnold Lobel", "Songs for the Open Road: Poems of Travel and Adventure- The American Poetry and Literacy Project", "The Open Door: “100 poems", "100 Years of Poetry” Magazine- Don Share and Christian Wiman", "Poetry Matters- Ralph Fletcher", "Poetry for Dummmies- John Timpane", "Poems by Cats- Francesco Marciuliano"};
Double [] PrPoe={299.00, 299.00, 249.00, 299.00, 239.00, 199.00, 149.00, 139.00, 199.00, 129.00, 199.00};
String [] Science={"Volcanoes- Seymour Simon", "Stars- Seymour Simon", "The Brain- Seymour Simon", "Cosmos- Carl Sagan", "Contact- Carl Sagan", "Brocas’ Brain: Reflections on the Romance of Science- Carl Sagan", "The Dragons of Eden: Speculations on the Evolution of Human Intelligence- Carl Sagan", "On the Origin of Species- Charles Darwin", "Phantoms in the Brain: Human Nature and the Architecture of the Mind- V.S Ramachandran", "The Pill Book- Harold M. Silverman", "The Selfish Gene- Richard Dawkins", "E= mc2 – David Bodanis", " The Quantum World: Quantum Physics for Everyone- Kenneth W. Ford", "The Elements of Murder: A History of Poison- John Emsley", "What on Earth Happened?... In Brief- Christopher Lloyd", "The Interpretation of Dreams- Sigmund Freud", "The Language Instinct: How the Mind Creates Languages- Steven Pinker", "The Tell- Tale Brain: A Neuroscientist’s Quest fro What Makes Us Human- V. S. Ramachandran", "The Blind Watchmaker: Why the Evidence of Evolution Reveals a Universe Without Design- Richard Dawkins", "The Canon: A Whirlgig Tour of he Beautiful Basics of Science- Natalie Angier", "The Grand Design- Stephen Hawking", "Short History of Nearly Everything- Bill Bryson", "The Emperor of All Maladies: A Biography of Cancer- Siddhartha Mukherjee"};
Double [] PrSci={99.00, 99.00, 99.00, 199.00, 199.00, 249.00, 299.00, 349.00, 249.00, 199.00, 299.00, 249.00, 249.00, 239.00, 219.00, 199.00, 199.00, 299.00, 149.00, 129.00, 149.00, 349.00, 229.00};
String [] BFEconomics={"Economics in One Lesson- Henry Hazlitt", "Economics: Principle", "Problems and Policies- Campbell R. McConnell", "Economics for Dummies: Sean Masaki Flynn", "Basic Economics: A Common Sense Guide to the Economy", "Economic Facts and Fallacies- Thomas Sowell", "Start Your Own Business- Entrepreneur Press", "Maximum Achievement: Strategies and Skills That Will Unlock Your Hidden Powers to Succeed- Brian tracy", "The Zen of Social Media Marketing- Shama Kabani", "The 80/ 20 Principle: The Secret to Achieving More with Less- Richard Koch", "100 Great Businesses and the Minds Behind Them- Emily Ross", "Personal Finance for Dummies- Eric Tyson", "Quickbooks 2012 Official Guide- Leslie Capachietti", "Finance and the Good Society- Robert J. Shiller", "5 Simple Steps to Easy Credit Repair- Jeremy Maher", "Investment Valuation- Aswath Damodaran"};
Double [] PrBFE={299.00, 249.00, 199.00, 219.00, 239.00, 239.00, 219.00, 289.00, 199.00, 299.00, 199.00, 149.00, 249.00, 299.00, 319.00, 249.00};
String [] SPhilosophy={"Freud (The Routledge Philosophers)- Jonathan Lear", "The Philosophy Book- Will Buckingham", "The Ultimate Anthology of Philosophy- Greatest Hits Series", "An Introduction to Philosophy- George Stuart Fullerton", "Philosophy Made Simple- Richard H. Popkin and Avrum Stroll", "Spiritual Growth: Being Your Higher Self- Sanaya Roman", "Spiritual Solutions: Answers to Life’s Greatest Challenges- Deepak Chopra", "The Seven Spiritual Laws of Success- Deepak Chopra", "The Simplicity of Spiritual Enlightenment- Roy Eugene Davis", "The Power of Now: A Guide to Spiritual Enlightenment- Eckhart Tolle"};
Double [] PrSP={249.00, 239.00, 299.00, 219.00, 199.00, 289.00, 299.00, 279.00, 239.00, 249.00};
String [] Religion = {"The God Delusion- Richard Dawkins", "The Religious Beliefs of America’s Founders- Gregg L. Frazer", "Religious Signing: A Comprehensive Guide for All Faiths- Elaine Costello", "Christianity: The First Three Thousand Years- Diarmaid MacCulloch", "Hinduism- Swami Vivekananda", "Islam and the Arab Awakening- Tariq Ramadan", "The Book of Jewish Belief- Louis Jacobs", "Sikh Spiritual Practice- Siri Kirpal Kaur Khalsa", "The Heart of Buddha’s Teaching- Thich Nhat Hanh", "The Koran (Qu’ ran)- Abdullah Yusuf Ali", "Bhagavad Gita- A. C. Bhaktivendanta Swami Prabhupada", "The Holy Bible- Crossway Bibles"};
Double [] PrReli={249.00, 239.00, 139.00, 219.00, 249.00, 249.00, 239.00, 239.00, 289.00, 299.00, 399.00, 349.00};
String [] AgathaC={"Murder on the Orient Express", "The Mystery of the Blue Train", "The Murder on the Links", "Taken at the Flood", "Death in the Clouds", "The Labors of Hercules", "The Hollow", "The Murder of Roger Ackroyd", "Death on the Nile", "Mrs. McGinty’s Dead", "The A. B. C Murders", "Dead Man’s Folly", "Dumb Witness", "Five Little Pigs", "Cards on the Table"};
Double [] PrAC={199.00, 199.00, 149.00, 199.00, 129.00, 119.00, 159.00, 189.00, 199.00, 149.00, 219.00, 129.00, 119.00, 99.00, 129.00};
String [] CharlesD={"The Posthumus Papers of the Pickwick Club", "The Adventures of Oliver Twist", "The Life and Adventures of Nicholas Nickleby", "The Old Curiosity Shop", "Barnaby Rudge", "A Christmas Carol", "The Chimes", "Dombey and Son", "Bleak House", "David Copperfield", "A Tale of Two Cities", "Great Expectations", "Little Dorrit", "The Mystery of Edwin Drood", "Our Mutual Friend"};
Double [] PrCD={299.00, 199.00, 249.00, 199.00, 239.00, 219.00, 199.00, 199.00, 219.00, 239.00, 199.00, 199.00, 149.00, 239.00, 239.00};
String [] DanB={"Angels and Demons", "Da Vinci Code", "Lost Symbol", "Digital Fortress", "Deception Point"};
Double [] PrDB={199.00, 249.00, 214.00 ,289.00, 279.00};
String [] Suess={"The Cat in the Hat", "Green Eggs and Ham", "One Fish Two Fish Red Fish Blue Fish", "Fox in Socks", "Yertle the Turtle and Other Stories", "Scrambled Eggs Super!", "If I Ran the Zoo", "Thidwick the Big- Hearted Moose", "Horton Hatches the Egg", "McElligot's Pool", "How the Grinch Stole CHristmas!", "And to Think I Saw It on Mulberry Street", "The Lorax", "The King's Stilts", "The 500 Hats of Bartholomew Cubbins"};
Double [] PrSu={149.00, 149.00, 149.00, 149.00, 199.00, 159.00, 189.00, 149.00, 149.00, 139.00, 199.00, 169.00, 139.00, 129.00, 189.00};
String [] EoinC={"Artemis Fowl", "Artemis Fowl: The Arctic Incident", "Artemis Fowl and the Eternity Code", "Artemis Fowl and the Opal Deception", "Artemis Fowl and the Lost Colony", "Artemis Fowl and the Time Paradox", "Artemis Fowl and the Atlantis Complex", "Artemis Fowl and the Last Guardian", "The Supernaturalist", "The Wish List", "Airman", "Half Moon Ivestigators", "Plugged", "Click"};
Double [] PrEC={249.00, 249.00, 249.00, 249.00, 249.00, 299.00, 299.00, 299.00, 239.00, 219.00, 199.00, 199.00, 149.00, 139.00};
String [] IsaacA={"Bicentennial Man", "Nemesis", "Foundation", "Foundation's Edge", "I- Robot", "The Rest of the Robots", "Second Foundation", "The End of Eternity", "Fantastic Voyage", "fantastic Voyage II: Destination Brain", "The Gods Themselves", "Nine Tomorrows", "Robot dreams", "Magic", "Azazel"};
Double [] PrIA={299.00, 249.00, 199.00, 199.00, 239.00, 199.00, 219.00, 249.00, 239.00, 299.00, 239.00, 199.0, 199.00, 149.00, 189.00};
String [] JeanS={"Princess", "Princess Sultana's Daughters", "Princess Sultana's Circle", "Daughter of Iraq Mayada", "Love in a Torn Land", "For the Love of a Son", "Growing Up Bin Laden", "American Chick in Saudi Arabia (True Story)", "The Rape of Kuwait", "Ester's Child"};
Double [] PrJS={249.00, 249.00, 249.00, 239.00, 239.00, 219.00, 199.00, 229.00, 299.00, 249.00};
String [] MegC={"Princess Diaries (Set)", "The Mediator", "Teen Idol", "Underworld", "Avalon High", "Size 12 and Ready to Rock", "Out of the Blue", "Pants on Fire", "All- American Girl", "Airhead (Set)", "Abandon", "Jinx", "Victoria and the Rogue", "Nicola and the Viscount", "Vanished (Set)"};
Double [] PrMC={1099.00, 899.00, 229.00, 199.00, 219.00, 219.00, 249.00, 219.00, 249.00, 999.00, 199.0, 249.00, 239.00, 199.00, 799.00};
String [] RoaldD={"Charlie and the Chocolate Factory", "Charlie and the Glass Elevator", "Matilda", "The Witches", "the Twits", "Danny the Champion of the World", "Fantastic Mr. Fox", "Esio Trot", "The BFG", "The Giraffe and the Pelly and Me", "George's Marvellous Medicine", "the Golden Ticket", "The Magic Finger", "The Minpins", "The Wonderful Story of Henry Sugar"};
Double [] PrRD={199.00, 199.00, 149.00, 99.00, 89.00, 99.00, 89.00, 99.00, 99.00, 149.00, 129.00, 129.00, 99.00, 199.0, 199.0};
String [] Shakespeare={"As You Like It", "Romeo and Juliet", "Macbeth", "All's Well That Ends Well", "The Merchant of Venice", "The Comedy of Errors", "A Midsummer's Night's Dream", "The Taming of the Shrew", "King Lear", "Othello", "Hamlet", "Julius Caesar", "King John", "Richard II", "Henry V"};
Double [] PrSh={249.00, 249.00,249.00,249.00,249.00,249.00,249.00,249.00,249.00,249.00,249.00,249.00,249.00,249.00,249.00};
int book, l, con;
String Book="";
Double Price=0.0;
String num;
double gp;
double budget;
int nob;int gw;
String [] Purchase=new String [50];
double [] Bill=new double [50];
public void main()throws IOException
{System.out.println('\f');
System.out.println("                                                                                         WELCOME TO                       ");
System.out.println("                                                                                      WORLD OF PAGES                     ");
System.out.println("                                                                               THE BOOKSTORE OF YOUR DREAMS!");
System.out.println("****************************************************************************************************************************************************************************************************************");
System.out.println("                                                                                 ENTER ANY KEY TO CONTINUE!");
String misc= in.readLine();
System.out.println('\f');
outer:
for(l=0;l<50;l++)
{budget=0.0;
System.out.println("Would you like to shop with a budget?");
System.out.println("(1) Yes");
System.out.println("(2) No");
int bc= Integer.parseInt(in.readLine());
switch(bc)
{
case 1: System.out.println("Please enter your budget limit!");
budget=Double.parseDouble(in.readLine());
case 2: 
}
System.out.println('\f');
System.out.println("How would you like to choose your book?");
System.out.println("Enter:");
System.out.println("(1) To choose by genre;");
System.out.println("(2) To choose by author; or");
int choice= Integer.parseInt(in.readLine());
System.out.println('\f');

switch(choice)
{
case 1: 
{
System.out.println("Choose from the following genres:");
System.out.println("(1)Fiction (general)");
System.out.println("(2)Science Fiction");
System.out.println("(3)Historical Fiction");
System.out.println("(4)Crime/ Mystery/ Detective Stories");
System.out.println("(5)Horror");
System.out.println("(6)Fantasy");
System.out.println("(7)Mythology");
System.out.println("(8)Romance");
System.out.println("(9)Classic(Original and Abridged)");
System.out.println("(10)Comics");
System.out.println("(11)Humour/ Satire");
System.out.println("(12)Biography/ Memoirs");
System.out.println("(13)Poetry");
System.out.println("(14)Science");
System.out.println("(15)Economics/ Business/ Finance");
System.out.println("(16)Philosophy/ Spirituality");
System.out.println("(17)Religion");
int genre=Integer.parseInt(in.readLine());
System.out.println('\f');
switch(genre)
{
case 1:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<29;b++)
{
if(PrFic[b]<=budget)
{
System.out.println("  Book: "+Fiction[b]);
System.out.println(" Price: "+PrFic[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)Animal Farm- George Orwell");
System.out.println("(2)1984- George Orwell");
System.out.println("(3)Neverwhere- Neil Gaiman");
System.out.println("(4)Among the Hidden- Margaret Peterson Haddix");
System.out.println("(5)The Iron Man- Ted Hughes");
System.out.println("(6)A Clockwork Orange- Anthony Burgess");
System.out.println("(7)Congo- Michael Crichton");
System.out.println("(8)The Handmaid’s Tale- Margaret Atwood");
System.out.println("(9)Fahrenheit 451- Ray Bradbury");
System.out.println("(10)Doctor on the Boil- Richard Gordon");
System.out.println("(11)Great Medical Mysteries- Richard Gordon");
System.out.println("(12)Next- Michael Crichton");
System.out.println("(13)Micro- Michael Crichton");
System.out.println("(14)Stardust- Neil Gaiman");
System.out.println("(15)Matilda- Roald Dahl");
System.out.println("(16)The BFG- Roald Dahl");
System.out.println("(17)The Witches- Roald Dahl");
System.out.println("(18)The Twits- Roald Dahl");
System.out.println("(19)Danny the Champion of the World- Roald Dahl");
System.out.println("(20)Fantastic Mr. Fox- Roald Dahl");
System.out.println("Vampire Academy- Richelle Mead");
System.out.println("(21)Vampire Academy");
System.out.println("(22)Frostbite");
System.out.println("(23)Shadow Kiss");
System.out.println("(24)Blood Promise");
System.out.println("(25)Spirit- Bound");
System.out.println("(26)Last Sacrifice");
System.out.println("Hunger Games Trilogy- Suzanne Collins");
System.out.println("(27)Hunger Games");
System.out.println("(28)Catching Fire");
System.out.println("(29)Mockingjay");
}
System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= Fiction[book-1];
Price=PrFic[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 2:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<28;b++)
{ 
if(PrScifi[b]<=budget)
{
System.out.println("  Book: "+Sciencef[b]);
System.out.println(" Price: "+PrScifi[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)Isaac Asimov’s Science Fiction Treasury- Isaac Asimov");
System.out.println("(2)Bicentennial Man- Isaac Asimov");
System.out.println("(3)Nemesis- Isaac Asimov");
System.out.println("(4)Foundation- Isaac Asimov");
System.out.println("(5)Prelude to Foundation- Isaac Asimov");
System.out.println("(6)Foundation’s Edge- Isaac Asimov");
System.out.println("(7)Second Foundation- Isaac Asimov");
System.out.println("(8)Foundation and Empire- Isaac Asimov");
System.out.println("(9)I- Robot- Isaac Asimov");
System.out.println("(10)The Rest of the Robots- Isaac Asimov");
System.out.println("(11)The Ultimate Hitchhiker’s Guide to Galaxy- Douglas Adams");
System.out.println("(12)The Selfish Gene- Richard Dawkins");
System.out.println("(13)Jurassic Park- Michael Crichton");
System.out.println("(14)The Restaurant at the End of the Universe- Douglas Adams");
System.out.println("(15)So Long, And Thanks For All the Fish- Douglas Adams");
System.out.println("(16)Brocas’ Brain: Reflections on the Romance of Science- Carl Sagan");
System.out.println("(17)The Doom Machine- Mark Teague");
System.out.println("(18)Brave New World- Aldous Huxley");
System.out.println("(19)The Lost World-  Sir Arthur Conan Doyle");
System.out.println("(20)Life, the Universe and Everything- Douglas Adams");
System.out.println("(21)Mostly Harmless- Douglas Adams");
System.out.println("(22)Songs of Distant Earth- Arthur C. Clarke");
System.out.println("(23)Prey- Michael Crichton");
System.out.println("(24)Planet of the Apes- Pierre Boulle");
System.out.println("(25)Artemis Fowl (Set)- Eoin Colfer");
System.out.println("Dark Materials Trilogy- Philip Pullaman");
System.out.println("(26)Northern Lights");
System.out.println("(27)The Subtle Knife");
System.out.println("(28)The Amber Spyglass");
}
System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= Sciencef[book-1];
Price= PrScifi[book-1];
for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 3:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<10;b++){
 if(PrHisf[b]<=budget){
System.out.println("  Book: "+Historicalf[b]);
System.out.println(" Price: "+PrHisf[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)Redfield Farm: A Novel of the Underground Railroad- Judith Redline Coopey");
System.out.println("(2)Dunaway’s Crossing- Nancy Brandon");
System.out.println("(3)Eye of the Needle- Ken Follett");
System.out.println("(4)Chanakya’s Chant- Ashwin Sanghi");
System.out.println("(5)Rozabal Line- Shawn Haigins and Ashwin Sanghi");
System.out.println("(6)Angels and Demons- Dan Brown");
System.out.println("(7)The Lost Symbol- Dan Brown");
System.out.println("(8)Da Vinci Code- Dan Brown");
System.out.println("(9)The Stolen Crown: The Secret marriage That Forever Changed the Fate of England- Susan Higginbotham");
System.out.println("(10)Rebekah’s Journey- Ann Bell");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= Historicalf[book-1];
Price= PrHisf[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 4:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<47;b++){
 if(PrCri[b]<=budget){
System.out.println("  Book: "+MDCrime[b]);
System.out.println(" Price: "+PrCri[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("(1)Choose from the following books!");
System.out.println("(2)The Invention of Hugo Cabret- Brian Selznick");
System.out.println("(3)Congo- Michael Crichton");
System.out.println("(4)The Curious Incident of the Dog in the Night Time- Mark Haddon");
System.out.println("(5)The Long Dark Tea- Time of the Soul- Douglas Adams");
System.out.println("(6)Boom!- Mark Haddon");
System.out.println("(7)State of Fear- Michael Crichton");
System.out.println("(8)Digital Fortress- Dan Brown");
System.out.println("(9)Perfect Crime- Jack Erickson");
System.out.println("(10)Watch Me Die- Lee Goldberg");
System.out.println("(11)The Mysterious Affair at Style- Agatha Christie");
System.out.println("(12)The Secret Adversary- Agatha Christie");
System.out.println("(13)And Then There Were None- Agatha Christie");
System.out.println("Hercule Poirot Mysteries- Agatha Christie");
System.out.println("(14)Murder on the Orient Express");
System.out.println("(15)The Mystery of the Blue Train");
System.out.println("(16)The Murder on the Links");
System.out.println("(17)Taken at the Flood");
System.out.println("(18)Death in the Clouds");
System.out.println("(19)The Labors of Hercules");
System.out.println("(20)The Hollow");
System.out.println("(21)The Murder of Roger Ackroyd");
System.out.println("(22)Death on the Nile");
System.out.println("(23)Mrs. McGinty’s Dead");
System.out.println("(24)The A. B. C Murders");
System.out.println("(25)Dead Man’s Folly");
System.out.println("(26)Dumb Witness");
System.out.println("(27)Five Little Pigs");
System.out.println("(28)Cards on the Table");
System.out.println("(29)Sherlock Homes (Single Volume)- Arthur Canon Doyle");
System.out.println("Secret Seven- Enid Blyton");
System.out.println("(30)Three Cheers Secret Seven");
System.out.println("(31)Fun for the Secret Seven");
System.out.println("(32)Good Old Secret Seven");
System.out.println("(33)Well Done, Secret Seven");
System.out.println("(34)Secret Seven Fireworks");
System.out.println("(35)Go Ahead Secret Seven");
System.out.println("(36)Good Work Secret Seven");
System.out.println("(37)Secret Seven on the Trail");
System.out.println("Famous Five- Enid Blyton");
System.out.println("(38)Five Go Down to Sea");
System.out.println("(39)Five Go to Smuggler’s Top");
System.out.println("(40)Five on a Treasure Island");
System.out.println("(41)Five Go to Demon Rocks");
System.out.println("(42)Five Get into Trouble");
System.out.println("(43)Five Go to Mystery Moor");
System.out.println("Sally Lockhart Mysteries- Philip Pullman");
System.out.println("(44)The Ruby in the Smoke");
System.out.println("(45)The Shadow in the North");
System.out.println("(46)The Tiger in the Well");
System.out.println("(47)The Tin Princess");
}
System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= MDCrime[book-1];
Price= PrCri[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 5:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<15;b++){ 
if(PrHor[b]<=budget){
System.out.println("  Book: "+Horror[b]);
System.out.println(" Price: "+PrHor[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)Fragile Things- Neil Gaiman");
System.out.println("(2)The Doll- J.C Martin");
System.out.println("(3)Torment- Jeff Menapace");
System.out.println("(4)A Walk in the Woods- Rebecca M. Senese");
System.out.println("(5)Midnight Paths: A Collection of Dark Horror- Joe Hart");
System.out.println("(6)The Final Winter- Mr. Ian Rob Wright");
System.out.println("(7)Horrific Happenings: A Dark Horror Anthology- James Anthony");
System.out.println("(8)The Accidental Exorcist- Joshua Graham");
System.out.println("(9)House of Leaves- Mark Z. Danielewski");
System.out.println("(10)Deadlocked- A. R Wise");
System.out.println("(11)The Woods of Red Hill- Shaun Whittington");
System.out.println("(12)They- Vincent Hobbes");
System.out.println("(13)Dead Heart- Brandon Ford");
System.out.println("(14)House Guest- John Paul Allen");
System.out.println("(15)Where Darkness Dwells: A Great Depression Horror Novel- Glen R. Krisch");
}
System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= Horror[book-1];
Price= PrHor[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 6:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<38;b++){
 if(PrFant[b]<=budget){
System.out.println("  Book: "+Fantasy[b]);
System.out.println(" Price: "+PrFant[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("Harry Potter- J. K. Rowling");
System.out.println("(1)Harry potter and the Sorcerer’s Stone");
System.out.println("(2)Harry potter and the Chamber of Secrets");
System.out.println("(3)Harry potter and the Prisoner of Azkaban");
System.out.println("(4)Harry potter and the Goblet of Fire");
System.out.println("(5)Harry potter and the Order of the Phoenix");
System.out.println("(6)Harry potter and the Half- Blood Prince");
System.out.println("(7)Harry potter and the Deathly Hallows");
System.out.println("(8)The Graveyard Book- Neil Gaiman");
System.out.println("Song of Ice and Fire- George R. R. Martin");
System.out.println("(9)A Game of Thrones");
System.out.println("(10)A Clash of Kings");
System.out.println("(11)A Storm of Swords");
System.out.println("(12)A Feast for Crows");
System.out.println("(13)A Dance with Dragons");
System.out.println("(14)The Winds of Winter");
System.out.println("(15)A Dream of Spring");
System.out.println("Inheritance Cycle- Christopher Paolini");
System.out.println("(16)Eragon");
System.out.println("(17)Eldest");
System.out.println("(18)Brisingr");
System.out.println("(19)Inheritance");
System.out.println("(20)Knights: The Eye of Divinity- Robert E. Keller");
System.out.println("(21)The Black God’s War- Moses Siregar III");
System.out.println("(22)The Thirteenth Unicorn- W. D. Newman");
System.out.println("(23)The Book of Deacon- Joseph Lallo");
System.out.println("(24)The Queen’s Blade- T. C. Southwell");
System.out.println("(25)Demonsouled- Jonathan Moeller");
System.out.println("(26)The Mind Readers- Lori Brighton");
System.out.println("(27)Box of Runes: Epic Fantasy Collection- J. Thorn");
System.out.println("(28)Draykon- Charlotte E. English");
System.out.println("(29)Child of the Ghosts-  Jonathan Moeller");
System.out.println("(30)Fantasy( Signature Select)- Lori Foster");
System.out.println("(31)The Last Elf of Lanis- K. J. Hargan");
System.out.println("(32)Dragon Blood- Anthony D. Franklin");
System.out.println("(33)The Island- Michael Stark");
System.out.println("(34)Clockwork Fairytale- Hellen Scott Taylor");
System.out.println("(35)Clockwork Princess- Cassandra Clare");
System.out.println("Mistborn Trilogy- Brandon Sanderson");
System.out.println("(36)Mistborn");
System.out.println("(37)The Hero of Ages");
System.out.println("(38)The Well of Ascension");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book=Fantasy[book-1];
Price= PrFant[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 7:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<24;b++){
 if(PrMyth[b]<=budget){
System.out.println("  Book: "+Mythology[b]);
System.out.println(" Price: "+PrMyth[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)Anansi Boys- Neil Gaiman");
System.out.println("(2)American Gods- Neil Gaiman");
System.out.println("(3)Heroes, Gods and Monsters of the Greek Myths- Bernard Evslin");
System.out.println("(4)Treasury of Greek Mythology- G. A. Buxton");
System.out.println("(5)The Norse Myths( Pantheon Fairy Tale and Folklore Library)- Kevin Crossley- Holland");
System.out.println("(6)Asgard Stories: Tales from Norse Mythology- Mary H. Foster");
System.out.println("(7)100 Characters from Classical mythology: Greek and Roman- Malcolm Day");
System.out.println("(8)Indian Mythology: Tales, Symbols, and Rituals from the Heart of the Subcontinent- Devdutt Pattanaik");
System.out.println("(9)American Indian Myths and Legends- Richard Erdoes and Alfonso Ortiz");
System.out.println("(10)The Ramayana (A Retelling )- Valmiki");
System.out.println("(11)“Mahabharata” of Vyasa- P. Lal");
System.out.println("Percy Jackson and the Olympians- Rick Riordan");
System.out.println("(12)Percy Jackson and the Lightning Thief");
System.out.println("(13)Percy Jackson and the Sea of Monsters");
System.out.println("(14)Percy Jackson and the Curse of the Titans");
System.out.println("(15)Percy Jackson and the Battle of the Labyrinth");
System.out.println("(16)Percy Jackson and the Last Olympian");
System.out.println("Heroes of Olympus- Rick Riordan");
System.out.println("(17)The Lost Hero");
System.out.println("(18)Son of Neptune");
System.out.println("(19)The Mark of Athena");
System.out.println("Kane Chronicles- Rick Riordan");
System.out.println("(20)The Red Pyramid");
System.out.println("(21)The Throne of Fire");
System.out.println("(22)The Serpent’s Shadow");
System.out.println("(23)Egyptian Tales: The Complete Collection- W. M. Flinders Petrie");
System.out.println("(24)Legends of he Gods: The Egyptian Texts, Edited with translations- E. A. Wallis Budge");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= Mythology[book-1];
Price= PrMyth[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 8:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<21;b++){ 
if(PrRom[b]<=budget){
System.out.println("  Book: "+Romance[b]);
System.out.println(" Price: "+PrRom[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)The Host- Stephenie meyer");
System.out.println("(2)Dane- Liliana Hart");
System.out.println("(3)Second Chance Romance- Asrai Devin");
System.out.println("(4)Complications over Coffee- Asrai Devin");
System.out.println("(5)Love Can’t Wait- Asrai Devin");
System.out.println("(6)Intimate Strangers- Laura Taylor");
System.out.println("(7)Take Me- Bella Andre");
System.out.println("(8)Love Me- Bella Andre");
System.out.println("(9)Crazy Love- Nicola Marsh");
System.out.println("(10)Accidental Married To… A Vampire?- Mimi Jean Pamfiloff");
System.out.println("Twilight series- Stephenie Meyer");
System.out.println("(11)Twilight");
System.out.println("(12)New Moon");
System.out.println("(13)Eclipse");
System.out.println("(14)Breaking Dawn");
System.out.println("(15)Seducing Miss Dunaway- Kate Rothwell");
System.out.println("(16)Bared to You: A Crossfire Novel- Sylvia Day");
System.out.println("(17)All of You- Kelsey Maxwell");
System.out.println("(18)All’s Fair in Love and Seduction- Beverley Kendall");
System.out.println("(19)Right Fit Wrong Shoe- Varsha Dixit");
System.out.println("(20)Wrong Means Right End- Varsha Dixit");
System.out.println("(21)Xcess Baggage- Varsha Dixit");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= Romance[book-1];
Price= PrRom[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 9:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<15;b++){ 
if(PrClas[b]<=budget){
System.out.println("  Book: "+Classics[b]);
System.out.println(" Price: "+PrClas[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)A Tale of Two Cities- Charles Dickens");
System.out.println("(2)Jane Eyre- Charlotte Bronte");
System.out.println("(3)The Scarlet Letter- Nathaniel Hawthorne");
System.out.println("(4)Treasure island- Robert Louis Stevenson");
System.out.println("(5)David Copperfield- Charles Dickens");
System.out.println("(6)Little Women- Louisa May");
System.out.println("(7)Pride and Prejudice- Jane Austen");
System.out.println("(8)The Count of Monte Cristo- Alexandre Dumas");
System.out.println("(9)Oliver Twist- Charles Dickens");
System.out.println("(10)Jude the Obscure- Thomas Hardy");
System.out.println("(11)The Raven and Other Writings- Edgar Allan Poe");
System.out.println("(12)Charlotte’s Web- E. B. White");
System.out.println("(13)Nicholas Nickleby- Charles Dickens");
System.out.println("(14)Robin Hood of Sherwood- Ann Mcgovern");
System.out.println("(15)The Wind in the Willows- Ellen Miles");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= Classics[book-1];
Price= PrClas[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 10:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<30;b++){ 
if(PrCom[b]<=budget){
System.out.println("  Book: "+Comics[b]);
System.out.println(" Price: "+PrCom[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("Calvin and Hobbes- Bill Watterson");
System.out.println("(1)The Revenge of the Baby- Sat");
System.out.println("(2)The Calvin and Hobbes Tenth");
System.out.println("(3)Yukon He!");
System.out.println("(4)Something Under the Bed is Drooling");
System.out.println("(5)The Days are Just Packed");
System.out.println("(6)The Best of Laxman- R. K. Laxman");
System.out.println("Amar Chitra Katha");
System.out.println("(7)Stories from the Panchatantra");
System.out.println("(8)Tales of Narada");
System.out.println("(9)Shivaji the Great Maratha");
System.out.println("(10)Ganesha");
System.out.println("(11)Shiva and Parvati: A Story of Divine Love");
System.out.println("(12)Stories of Krishna");
System.out.println("(13)Heroes from the Mahabharata");
System.out.println("(14)Jataka Tales");
System.out.println("(15)Stories form the Bhagawat Gita");
System.out.println("Asterix and Obelix- Rene Goscinny and Albert Uderzo");
System.out.println("(16)Asterix at the Olympic Games");
System.out.println("(17)Asterix and the Cheftain’s Shield");
System.out.println("(18)Asterix and Caesar’s Gift");
System.out.println("(19)Asterix and the Actress");
System.out.println("(20)Asterix and Cleopatra");
System.out.println("Tintin- Herge");
System.out.println("(21)Tintin in America");
System.out.println("(22)Cigars of the Pharaoh");
System.out.println("(23)The Blue Lotus");
System.out.println("(24)The Broken Ear");
System.out.println("(25)The Black Island");
System.out.println("(26)King Ottokar’s Sceptre");
System.out.println("(27)The Crab with the Golden Claws");
System.out.println("(28)The Shooting Star");
System.out.println("(29)The Secret of the Unicorn");
System.out.println("(30)Great Marvel Collection- Roy Rockwood");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= Comics[book-1];
Price= PrCom[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 11:
if(budget!=0.0){
System.out.println("Choose from the following books!");
for(int b=0;b<10;b++){ 
if(PrHum[b]<=budget){
System.out.println("  Book: "+SHumour[b]);
System.out.println(" Price: "+PrHum[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)The Restaurant at the End of the Universe- Douglas Adams");
System.out.println("(2)The Animal Farm- George Orwell");
System.out.println("(3)Brave New World- Aldous Huxley");
System.out.println("(4)The Mancode: Exposed- Rachel Thompson");
System.out.println("(5)Aunts Aren’t Gentlemen- P. G. Wodehouse");
System.out.println("(6)Ruskin Bond’s Book of Humour- Ruskin Bond");
System.out.println("(7)The Diary of a Social Butterfly- Moni Mohsin");
System.out.println("(8)May I Hebb Yout Attention Pliss- Arnab Ray");
System.out.println("(9)Duty Free- Moni Mohsin");
System.out.println("(10)Tender Hooks- Moni Mohsin");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= SHumour[book-1];
Price= PrHum[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 12:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<10;b++){ 
if(PrMB[b]<=budget){
System.out.println("  Book: "+MBiography[b]);
System.out.println(" Price: "+PrMB[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)Prisoner’s Dilemma- William Poundstone");
System.out.println("(2)Surely You’re Joking, Mr. Feynman!(Adventures of a Curious Character)- Richard P. Feynman");
System.out.println("(3)The Boy Who Harnessed the Wind- William Kamkwamba");
System.out.println("(4)The Motorcycle Diaries- Ernesto Che Guevara");
System.out.println("(5)Steve Jobs- Walter Isaacson");
System.out.println("(6)The Story of Walt Disney: Maker of Magical Worlds- Bernice Selden");
System.out.println("(7)The Autobiography of Benjamin Franklin- Benjamin");
System.out.println("(8)Ordinary Genius: the Story of Albert Einstein- Stephanie Sammartino McPherson");
System.out.println("(9)The Story of My Experiments with Truth: Gandhi, An Autobiography - Mohandas Karamchand Gandhi");
System.out.println("(10)People: Gone Too Soon: Remembering 65 Celebrities Who Died Too Young- People Magazine");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= MBiography[book-1];
Price= PrMB[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 13:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<10;b++){ 
if(PrPoe[b]<=budget){
System.out.println("  Book: "+Poetry[b]);
System.out.println(" Price: "+PrPoe[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)101 Great American Poems- The American Poetry and Literacy Project");
System.out.println("(2)The Poetry of Robert Browning- Stopford A. Brooke");
System.out.println("(3)Where the Sidewalk Ends- Shel Silverstein");
System.out.println("(4)Poetry Young People: Robert Frost");
System.out.println("(5)The Random House Book of Poetry for Children- Jack Pretlusky and Arnold Lobel");
System.out.println("(6)Songs for the Open Road: Poems of Travel and Adventure- The American Poetry and Literacy Project");
System.out.println("(7)The Open Door: “100 poems, 100 Years of Poetry” Magazine- Don Share and Christian Wiman");
System.out.println("(8)Poetry Matters- Ralph Fletcher");
System.out.println("(9)Poetry for Dummmies- John Timpane");
System.out.println("(10)Poems by Cats- Francesco Marciuliano");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= Poetry[book-1];
Price= PrPoe[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 14:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<23;b++){ 
if(PrSci[b]<=budget){
System.out.println("  Book: "+Science[b]);
System.out.println(" Price: "+PrSci[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)Volcanoes- Seymour Simon");
System.out.println("(2)Stars- Seymour Simon");
System.out.println("(3)The Brain- Seymour Simon");
System.out.println("(4)Cosmos- Carl Sagan");
System.out.println("(5)Contact- Carl Sagan");
System.out.println("(6)Brocas’ Brain: Reflections on the Romance of Science- Carl Sagan");
System.out.println("(7)The Dragons of Eden: Speculations on the Evolution of Human Intelligence- Carl Sagan");
System.out.println("(8)On the Origin of Species- Charles Darwin");
System.out.println("(9)Phantoms in the Brain: Human Nature and the Architecture of the Mind- V.S Ramachandran");
System.out.println("(10)The Pill Book- Harold M. Silverman");
System.out.println("(11)The Selfish Gene- Richard Dawkins");
System.out.println("(12)E= mc2 – David Bodanis");
System.out.println("(13)The Quantum World: Quantum Physics for Everyone- Kenneth W. Ford");
System.out.println("(14)The Elements of Murder: A History of Poison- John Emsley");
System.out.println("(15)What on Earth Happened?... In Brief- Christopher Lloyd");
System.out.println("(16)The Interpretation of Dreams- Sigmund Freud");
System.out.println("(17)The Language Instinct: How the Mind Creates Languages- Steven Pinker");
System.out.println("(18)The Tell- Tale Brain: A Neuroscientist’s Quest fro What Makes Us Human- V. S. Ramachandran");
System.out.println("(19)The Blind Watchmaker: Why the Evidence of Evolution Reveals a Universe Without Design- Richard Dawkins");
System.out.println("(20)The Canon: A Whirlgig Tour of he Beautiful Basics of Science- Natalie Angier");
System.out.println("(21)The Grand Design- Stephen Hawking");
System.out.println("(22)Short History of Nearly Everything- Bill Bryson");
System.out.println("(23)The Emperor of All Maladies: A Biography of Cancer- Siddhartha Mukherjee");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= Science[book-1];
Price= PrSci[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 15:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<15;b++){ 
if(PrBFE[b]<=budget){
System.out.println("  Book: "+BFEconomics[b]);
System.out.println(" Price: "+PrBFE[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)Economics in One Lesson- Henry Hazlitt");
System.out.println("(2)Economics: Principle, Problems and Policies- Campbell R. McConnell");
System.out.println("(3)Economics for Dummies: Sean Masaki Flynn");
System.out.println("(4)Basic Economics: A Common Sense Guide to the Economy");
System.out.println("(5)Economic Facts and Fallacies- Thomas Sowell");
System.out.println("(6)Start Your Own Business- Entrepreneur Press");
System.out.println("(7)Maximum Achievement: Strategies and Skills That Will Unlock Your Hidden Powers to Succeed- Brian tracy");
System.out.println("(8)The Zen of Social Media Marketing- Shama Kabani");
System.out.println("(9)The 80/ 20 Principle: The Secret to Achieving More with Less- Richard Koch");
System.out.println("(10)100 Great Businesses and the Minds Behind Them- Emily Ross");
System.out.println("(11)Personal Finance for Dummies- Eric Tyson");
System.out.println("(12)Quickbooks 2012 Official Guide- Leslie Capachietti");
System.out.println("(13)Finance and the Good Society- Robert J. Shiller");
System.out.println("(14)5 Simple Steps to Easy Credit Repair- Jeremy Maher");
System.out.println("(15)Investment Valuation- Aswath Damodaran");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= BFEconomics[book-1];
Price= PrBFE[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 16:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<10;b++){
 if(PrSP[b]<=budget){
System.out.println("  Book: "+SPhilosophy[b]);
System.out.println(" Price: "+PrSP[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)Freud (The Routledge Philosophers)- Jonathan Lear");
System.out.println("(2)The Philosophy Book- Will Buckingham");
System.out.println("(3)The Ultimate Anthology of Philosophy- Greatest Hits Series");
System.out.println("(4)An Introduction to Philosophy- George Stuart Fullerton");
System.out.println("(5)Philosophy Made Simple- Richard H. Popkin and Avrum Stroll");
System.out.println("(6)Spiritual Growth: Being Your Higher Self- Sanaya Roman");
System.out.println("(7)Spiritual Solutions: Answers to Life’s Greatest Challenges- Deepak Chopra");
System.out.println("(8)The Seven Spiritual Laws of Success- Deepak Chopra");
System.out.println("(9)The Simplicity of Spiritual Enlightenment- Roy Eugene Davis");
System.out.println("(10)The Power of Now: A Guide to Spiritual Enlightenment- Eckhart Tolle");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= SPhilosophy[book-1];
Price= PrSP[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 17:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<12;b++){ 
if(PrReli[b]<=budget){
System.out.println("  Book: "+Religion[b]);
System.out.println(" Price: "+PrReli[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)The God Delusion- Richard Dawkins");
System.out.println("(2)The Religious Beliefs of America’s Founders- Gregg L. Frazer");
System.out.println("(3)Religious Signing: A Comprehensive Guide for All Faiths- Elaine Costello");
System.out.println("(4)Christianity: The First Three Thousand Years- Diarmaid MacCulloch");
System.out.println("(5)Hinduism- Swami Vivekananda");
System.out.println("(6)Islam and the Arab Awakening- Tariq Ramadan");
System.out.println("(7)The Book of Jewish Belief- Louis Jacobs");
System.out.println("(8)Sikh Spiritual Practice- Siri Kirpal Kaur Khalsa");
System.out.println("(9)The Heart of Buddha’s Teaching- Thich Nhat Hanh");
System.out.println("(10)The Koran (Qu’ ran)- Abdullah Yusuf Ali");
System.out.println("(11)Bhagavad Gita- A. C. Bhaktivendanta Swami Prabhupada");
System.out.println("(12)The Holy Bible- Crossway Bibles");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= Religion[book-1];
Price= PrReli[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
}
}
break;
case 2:
{
System.out.println("Choose from the following authors:");
System.out.println("(1)Agatha Christie");
System.out.println("(2)Charles Dickens");
System.out.println("(3)Dan Brown");
System.out.println("(4)Dr. Suess");
System.out.println("(5)Eoin Colfer");
System.out.println("(6)Isaac Asimov");
System.out.println("(7)Jean Sasson");
System.out.println("(8)Meg Cabot");
System.out.println("(9)Roald Dahl");
System.out.println("(10)Shakespeare");
int author=Integer.parseInt(in.readLine());
System.out.println('\f');
switch(author)
{
case 1:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<15;b++){
 if(PrAC[b]<=budget){
System.out.println("  Book: "+AgathaC[b]);
System.out.println(" Price: "+PrAC[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)Murder on the Orient Express");
System.out.println("(2)The Mystery of the Blue Train");
System.out.println("(3)The Murder on the Links");
System.out.println("(4)Taken at the Flood");
System.out.println("(5)Death in the Clouds");
System.out.println("(6)The Labors of Hercules");
System.out.println("(7)The Hollow");
System.out.println("(8)The Murder of Roger Ackroyd");
System.out.println("(9)Death on the Nile");
System.out.println("(10)Mrs. McGinty’s Dead");
System.out.println("(11)The A. B. C Murders");
System.out.println("(12)Dead Man’s Folly");
System.out.println("(13)Dumb Witness");
System.out.println("(14)Five Little Pigs");
System.out.println("(15)Cards on the Table");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= AgathaC[book-1];
Price= PrAC[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:
continue outer;
case 2:
break outer;
}
break;
case 2:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<15;b++){
 if(PrCD[b]<=budget){
System.out.println("  Book: "+CharlesD[b]);
System.out.println(" Price: "+PrCD[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)The Posthumus Papers of the Pickwick Club");
System.out.println("(2)The Adventures of Oliver Twist");
System.out.println("(3)The Life and Adventures of Nicholas Nickleby");
System.out.println("(4)The Old Curiosity Shop");
System.out.println("(5)Barnaby Rudge");
System.out.println("(6)A Christmas Carol");
System.out.println("(7)The Chimes");
System.out.println("(8)Dombey and Son");
System.out.println("(9)Bleak House");
System.out.println("(10)David Copperfield");
System.out.println("(11)A Tale of Two Cities");
System.out.println("(12)Great Expectations");
System.out.println("(13)Little Dorrit");
System.out.println("(14)The Mystery of Edwin Drood");
System.out.println("(15)Our Mutual Friend");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= CharlesD[book-1];
Price= PrCD[book-1];
  for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 3:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<5;b++){ 
if(PrDB[b]<=budget){
System.out.println("  Book: "+DanB[b]);
System.out.println(" Price: "+PrDB[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)Angels and Demons");
System.out.println("(2)Da Vinci Code");
System.out.println("(3)Lost Symbol");
System.out.println("(4)Digital Fortress");
System.out.println("(5)Deception Point");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= DanB[book-1];
Price= PrDB[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 4:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<15;b++){
 if(PrSu[b]<=budget){
System.out.println("  Book: "+Suess[b]);
System.out.println(" Price: "+PrSu[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)The Cat in the Hat");
System.out.println("(2)Green Eggs and Ham");
System.out.println("(3)One Fish Two Fish Red Fish Blue Fish");
System.out.println("(4)Fox in Socks");
System.out.println("(5)Yertle the Turtle and Other Stories");
System.out.println("(6)Scrambled Eggs Super!");
System.out.println("(7)If I Ran the Zoo");
System.out.println("(8)Thidwick the Big- Hearted Moose");
System.out.println("(9)Horton Hatches the Egg");
System.out.println("(10)McElligot's Pool");
System.out.println("(11)How the Grinch Stole CHristmas!");
System.out.println("(12)And to Think I Saw It on Mulberry Street");
System.out.println("(13)The Lorax");
System.out.println("(14)The King's Stilts");
System.out.println("(15)The 500 Hats of Bartholomew Cubbins");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= Suess[book-1];
Price= PrSu[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 5:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<14;b++){ 
if(PrEC[b]<=budget){
System.out.println("  Book: "+EoinC[b]);
System.out.println(" Price: "+PrEC[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)Artemis Fowl");
System.out.println("(2)Artemis Fowl: The Arctic Incident");
System.out.println("(3)Artemis Fowl and the Eternity Code");
System.out.println("(4)Artemis Fowl and the Opal Deception");
System.out.println("(5)Artemis Fowl and the Lost Colony");
System.out.println("(6)Artemis Fowl and the Time Paradox");
System.out.println("(7)Artemis Fowl and the Atlantis Complex");
System.out.println("(8)Artemis Fowl and the Last Guardian");
System.out.println("(9)The Supernaturalist");
System.out.println("(10)The Wish List");
System.out.println("(11)Airman");
System.out.println("(12)Half Moon Ivestigators");
System.out.println("(13)Plugged");
System.out.println("(14)Click");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= EoinC[book-1];
Price= PrEC[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 6:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<15;b++){
 if(PrIA[b]<=budget){
System.out.println("  Book: "+IsaacA[b]);
System.out.println(" Price: "+PrIA[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)Bicentennial Man");
System.out.println("(2)Nemesis");
System.out.println("(3)Foundation");
System.out.println("(4)Foundation's Edge");
System.out.println("(5)I- Robot");
System.out.println("(6)The Rest of the Robots");
System.out.println("(7)Second Foundation");
System.out.println("(8)The End of Eternity");
System.out.println("(9)Fantastic Voyage");
System.out.println("(10)Fantastic Voyage II: Destination Brain");
System.out.println("(11)The Gods Themselves");
System.out.println("(12)Nine Tomorrows");
System.out.println("(13)Robot dreams");
System.out.println("(14)Magic");
System.out.println("(15)Azazel");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= IsaacA[book-1];
Price= PrIA[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 7:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<10;b++){ 
if(PrJS[b]<=budget){
System.out.println("  Book: "+JeanS[b]);
System.out.println(" Price: "+PrJS[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)Princess");
System.out.println("(2)Princess Sultana's Daughters");
System.out.println("(3)Princess Sultana's Circle");
System.out.println("(4)Daughter of Iraq Mayada");
System.out.println("(5)Love in a Torn Land");
System.out.println("(6)For the Love of a Son");
System.out.println("(7)Growing Up Bin Laden");
System.out.println("(8)American Chick in Saudi Arabia (True Story)");
System.out.println("(9)The Rape of Kuwait");
System.out.println("(10)Ester's Child");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= JeanS[book-1];
Price= PrJS[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 8:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<15;b++){ 
if(PrMC[b]<=budget){
System.out.println("  Book: "+MegC[b]);
System.out.println(" Price: "+PrMC[b]);
System.out.println("Number: "+(b+1)); }
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)Princess Diaries (Set)");
System.out.println("(2)The Mediator (Set)");
System.out.println("(3)Teen Idol");
System.out.println("(4)Underworld");
System.out.println("(5)Avalon High");
System.out.println("(6)Size 12 and Ready to Rock");
System.out.println("(7)Out of the Blue");
System.out.println("(8)Pants on Fire");
System.out.println("(9)All- American Girl");
System.out.println("(10)Airhead (Set)");
System.out.println("(11)Abandon");
System.out.println("(12)Jinx");
System.out.println("(13)Victoria and the Rogue");
System.out.println("(14)Nicola and the Viscount");
System.out.println("(15)Vanished (Set)");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= MegC[book-1];
Price= PrMC[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 9:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<15;b++){ 
if(PrRD[b]<=budget){
System.out.println("  Book: "+RoaldD[b]);
System.out.println(" Price: "+PrRD[b]);
System.out.println("Number: "+(b+1)); } 
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)Charlie and the Chocolate Factory");
System.out.println("(2)Charlie and the Glass Elevator");
System.out.println("(3)Matilda");
System.out.println("(4)The Witches");
System.out.println("(5)the Twits");
System.out.println("(6)Danny the Champion of the World");
System.out.println("(7)Fantastic Mr. Fox");
System.out.println("(8)Esio Trot");
System.out.println("(9)The BFG");
System.out.println("(10)The Giraffe and the Pelly and Me");
System.out.println("(11)George's Marvellous Medicine");
System.out.println("(12)the Golden Ticket");
System.out.println("(13)The Magic Finger");
System.out.println("(14)The Minpins");
System.out.println("(15)The Wonderful Story of Henry Sugar");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= RoaldD[book-1];
Price= PrRD[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
case 10:
if(budget!=0.0)
{
System.out.println("Choose from the following books!");
for(int b=0;b<15;b++){ 
if(PrSh[b]<=budget){
System.out.println("  Book: "+Shakespeare[b]);
System.out.println(" Price: "+PrSh[b]);
System.out.println("Number: "+(b+1));
}
}
}
else
{
System.out.println("Choose from the following books!");
System.out.println("(1)As You Like It");
System.out.println("(2)Romeo and Juliet");
System.out.println("(3)Macbeth");
System.out.println("(4)All's Well That Ends Well");
System.out.println("(5)The Merchant of Venice");
System.out.println("(6)The Comedy of Errors");
System.out.println("(7)A Midsummer's Night's Dream");
System.out.println("(8)The Taming of the Shrew");
System.out.println("(9)King Lear");
System.out.println("(10)Othello");
System.out.println("(11)Hamlet");
System.out.println("(12)Julius Caesar");
System.out.println("(13)King John");
System.out.println("(14)Richard II");
System.out.println("(15)Henry V");
}System.out.println("Enter the number of the book you wish to purchase."); book=Integer.parseInt(in.readLine()); System.out.println('\f'); System.out.println("How many copies of this book would you like?"); nob=Integer.parseInt(in.readLine()); 
Book= Shakespeare[book-1];
Price= PrSh[book-1];
 for(int n=0;n<nob;n++) { Purchase [l]=Book; Bill [l]=Price; l++;} System.out.println("Book chosen: "+ Book);
System.out.println("Price:       "+ Price);
System.out.println("This book has been added to your shopping cart. Would you like to:");
System.out.println("(1) go back to shopping;or ");
System.out.println("(2) proceed to payment?");
con=Integer.parseInt(in.readLine()); System.out.println('\f');
switch(con)
{
case 1:

continue outer;
case 2:
break outer;
}
break;
}
}
break;
}
}
System.out.println('\f');
System.out.println("Please enter your name and age.");
String name=in.readLine();
int age= Integer.parseInt(in.readLine());
if(age<11)
{
System.out.println("Please enter your guardian/parent's name and number.");
String pname= in.readLine();
String pnum= in.readLine();
}
else
{
System.out.println("Please enter your phone number.");
num= in.readLine();
}
System.out.println("Please enter your email id (optional).");
String email= in.readLine();
System.out.println("Kindly enter the address to which the delivery should take place.");
String address=in.readLine();
System.out.println("Kindly provide us with a landmark (optional).");
String landm= in.readLine();
System.out.println('\f');
System.out.println("Thank you. Proceeding to payment...");
System.out.println("Please choose your method of payment:");
System.out.println("(1) Cash on delivery;");
System.out.println("(2) Net Banking;");
System.out.println("(3) Credit Card");
System.out.println("(4) Debit Card");
int pay=Integer.parseInt(in.readLine());
System.out.println('\f');int ct=1;
switch(pay)
{
case 1: 
System.out.println("Thank you. Please pay on delivery.");
break;
case 2:
System.out.println("Please choose the bank through which you wish to pay:");
System.out.println("(1) ICICI Bank;");
System.out.println("(2) HDFC Bank;");
System.out.println("(3) State Bank of India;");
System.out.println("(4) City Union Bank;");
System.out.println("(5) Canara Bank;");
int bank=Integer.parseInt(in.readLine());
System.out.println('\f');
System.out.println("Please enter your account username.");
String un=in.readLine();
System.out.println("Please enter your password.");
String psw=in.readLine();
System.out.println('\f');
System.out.println("Your payment has successfully been processed.");
break;
case 3:
System.out.println("WARNING: Please enter information correctly otherwise transaction will be cancelled!");
System.out.println("Please select the type of card.");
System.out.println("(1) MasterCard;");
System.out.println("(2) Visa;");
int card=Integer.parseInt(in.readLine());
System.out.println('\f');
System.out.println("Please enter your name as it appears on the card.");
String cname=in.readLine();
System.out.println("Please enter the card number.");
String cno=in.readLine();
if(cno.length()>16||cno.length()<16)
{System.out.println("Error. Enter card number properly. Transaction cancelled.");ct=0;
break;}
System.out.println("Please enter the date of expiry.");
System.out.println("mm");
String mm=in.readLine();
System.out.println("yyyy");
String yy=in.readLine();
if(mm.length()<2||mm.length()>2||yy.length()<4||yy.length()>4)
{System.out.println("Error. Please type the number of digits properly. Transaction cancelled");ct=0;
break;}
System.out.println("Please enter the CVV number. (The 3- digit number at the back of your card.)");
String cvv=in.readLine();
if(cvv.length()>3||cvv.length()<3)
{System.out.println("Error. A CVV number has 3 digits. Transaction cancelled.");ct=0;
break;}
System.out.println("Please wait. Processing................");
System.out.println('\f');
System.out.println("Please enter your Verified by Visa(VbV) password.");
String vbv=in.readLine();
if(vbv.length()>6||vbv.length()<6)
{System.out.println("Error. A VbV password has 6 digits. Transaction cancelled.");ct=0;
break;}
System.out.println("Please wait. Processing...........");
System.out.println('\f');
System.out.println("Payment processed.");
break;
case 4:
System.out.println("WARNING: Please enter information correctly otherwise transaction will be cancelled!");
System.out.println("Please select the type of card.");
System.out.println("(1) MasterCard;");
System.out.println("(2) Visa;");
card=Integer.parseInt(in.readLine());
System.out.println('\f');
System.out.println("Please enter your name as it appears on the card.");
cname=in.readLine();
System.out.println("Please enter the card number.");
cno=in.readLine();
if(cno.length()>16||cno.length()<16)
{System.out.println("Error. Enter card number properly. Transaction cancelled.");ct=0;
break;}
System.out.println("Please enter the date of expiry.");
System.out.println("mm");
mm=in.readLine();
System.out.println("yyyy");
yy=in.readLine();
if(mm.length()<2||mm.length()>2||yy.length()<4||yy.length()>4)
{System.out.println("Errorr. Please type the number of digits properly. Transaction cancelled.");ct=0;
break;}
System.out.println("Please enter the CVV number. (The 3- digit number at the back of your card.)");
cvv=in.readLine();
if(cvv.length()>3||cvv.length()<3)
{System.out.println("Error. A CVV number has 3 digits. Transaction cancelled");ct=0;
break;}
System.out.println("Please wait. Processing................");
System.out.println('\f');
System.out.println("Please enter your Verified by Visa(VbV) password.");
vbv=in.readLine();
if(vbv.length()>6||vbv.length()<6)
{System.out.println("Error. A VbV password has 6 digits. Transaction cancelled");ct=0;
break;}
System.out.println("Please wait. Processing...........");
System.out.println('\f');
System.out.println("Payment processed.");
break;
}
double billtotal=0.0;
for(int b=0;b<Bill.length;b++)
{
billtotal+= Bill[b];
} if(ct==0){}else{
System.out.println("Do you wish to gift wrap your delivery? (Extra charges: Rs. 40)");
System.out.println("(1)Yes");
System.out.println("(2)No");
gw=Integer.parseInt(in.readLine());
switch(gw)
{
case 1:
gp=40.0;
billtotal+=gp;
break;
case 2:
break;
}
System.out.println('\f');
System.out.println("Bill:");
System.out.println('\n');}
print:
for(int d=0;d<Purchase.length;d++)
{if(ct==0){System.out.println("Thank you. Please visit again");break;}else{
if(Purchase[d]!=null)
{
if(Purchase[d]==Purchase [d+1])
{
continue print;
}
System.out.println("         Book: "+ Purchase[d]);
System.out.println("No. of copies: "+nob);
System.out.println("        Price: "+ Bill[d]);
}
}
}if(ct==0){}else{
if(gp==40.0)
System.out.println("    Gift wrap: "+gp);
System.out.println("        Total: "+ billtotal);
System.out.println("         Name: "+name);
System.out.println("      Address: "+ address);
System.out.println("      Contact: "+ num);
System.out.println('\n'+"Your books will reach you in one or two business days.");
System.out.println("Thank you.");}
}
}