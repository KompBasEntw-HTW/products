INSERT INTO
  flavornote (id, flavornote)
VALUES
  (nextval ('hibernate_sequence'), 'Milk Chocolate'),
  (nextval ('hibernate_sequence'), 'Citrus'),
  (nextval ('hibernate_sequence'), 'Ripe Fruit'),
  (nextval ('hibernate_sequence'), 'Brow Sugar'),
  (nextval ('hibernate_sequence'), 'Roastiness'),
  (nextval ('hibernate_sequence'), 'Earthiness'),
  (nextval ('hibernate_sequence'), 'Sweet Vanilla'),
  (nextval ('hibernate_sequence'), 'Spice'),
  (nextval ('hibernate_sequence'), 'Spice'),
  (nextval ('hibernate_sequence'), 'Nut');

INSERT INTO
  bagsize (id, name, weightInGrams, priceModifier)
VALUES
  (nextval ('hibernate_sequence'), 'S', 250, 1.0),
  (nextval ('hibernate_sequence'), 'M', 500, 0.9),
  (nextval ('hibernate_sequence'), 'L', 750, 0.8),
  (nextval ('hibernate_sequence'), 'XL', 1000, 0.7);

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Flatlander Signature Blend',
    'Sweet & Smooth',
    'Easy does it. And this coffee proves just that. A bittersweet aroma is balanced by a nutty, sweet finish. Here’s to one less complication.',
    'Topeka, KS',
    'PT''s',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660153923/solidus/afqrtebpoa6w4mhhdwtx.png',
    7,
    'Flatlander features a bittersweet chocolate aroma with a round body, notes of caramel, and a tangerine sweetness. It has a pleasant finish of roasted almonds and chocolate.',
    22.7
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Mejor',
    'Balanced & Fruity',
    'Fruity and sweet, with a juicy note of cherry bolstered by a deep, nutty sweetness.',
    'Miami, FL',
    'Panther',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1661522982/solidus/d78ulzlkw0q76vnf5clf.png',
    6,
    'Montmorency cherry, citrus, milk chocolate. Bright, sweet and silky',
    17.6
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Kickstart',
    'Sweet & Smooth',
    'Dark chocolate and brown sugar sweetness are front and center in this easy-drinking coffee, with a surprising (and delightful) note of rose throughout.',
    'Austin, TX',
    'Greater Goods',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660154037/solidus/nocubtg4czb5ycnonkrb.png',
    6,
    'Electrifying flavors of caramel and chocolate come together in a surprisingly smooth finish, sure to inspire anyone to glam-metal levels of greatness. A power-ballad blend of award-winning single-origin coffees, it''s popular for every brewing method - no espresso machine required!',
    23.9
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Emporium House Blend',
    'Sweet & Smooth',
    'Coffee should bring people together. This blend manages to unite three distinctly delicious single origins to create a truly harmonious coffee. Complex but approachable, no matter how you brew it.',
    'Austin, TX',
    'Cuvee',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660154297/solidus/mt45zafxhzc3vl5yxo4v.png',
    7,
    'An Emporium is a market place or trading center, which in a way describes who we are. We bring the best coffee from all over the world to our roastery in Austin, TX. We blend together several of our single origin selections to create this coffee that is complex and approachable, just the way a great blend should be and reason enough to make it our house favorite.',
    18.6
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Nebula - a Dark Roast',
    'Comforting & Rich',
    'Super honey-sweet and full-bodied, this comforting cup''s rich chocolaty notes and hint of roast will satisfy any sweet tooth.',
    'Oakland, CA',
    'Mother Tongue',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660154134/solidus/pdw7hgglym6y0yxqzknk.png',
    8,
    'If you are looking for a dark roast coffee with a low acidity, and helps improve farmers lives? All of the coffees in our Nebula Dark Roast come from the same stellar producers that we work with to make our signature blends and single farm coffees on our menu. The coffees chosen in Nebula score above 80 points which is the specialty coffee cut off line. I really love this project and called it Nebula because that is where stars are born.',
    17.6
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Amsterdam',
    'Sweet & Smooth',
    'Rich, sweet, smooth - this comforting cup reminds us of chocolaty fudge with a toffee swirl. Perfect on its own or with a splash of your favorite milk, we''re pretty sure you''ll love this one.',
    'New York, NY',
    'Joe',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660251115/solidus/sighjyhliefukn8dygvd.png',
    6,
    NULL,
    20.5
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Joven Cauca',
    'Sweet & Smooth',
    'Produced by the Cafinorte co-op''s Young Coffee Producers Program, this coffee has a smooth body and comforting chocolate flavors up front, with enough cherry cola depth to make for a really fun cup.',
    'Grand Rapids, MI',
    'Sparrows',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660251811/solidus/zfm2hw5a5zbfmxtnnzhl.png',
    6,
    'Not only was this Colombian coffee produced by young growers, it was also selected by the world''s youngest Q grader, Frankie Volkema. Sparrows worked with CAFINORTE cooperative in Colombia''s Cauca region to compile this blend of lots, in collaboration with Coffee For Peace. In the cup, it tastes of rich milk chocolate, sweet citrus, and spring flowers. More than all, it celebrates immense accomplishment by the future of coffee.',
    25.1
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Late Night',
    'Comforting & Rich',
    'This (caffeinated) cozy cup brings you all the comfort you need in your morning routine: a smooth, rich body and deep chocolaty sweetness envelop notes of roasted walnut and hints of clove.',
    'Greenville, SC',
    'Methodical',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660243367/solidus/jbpgq7djhldulgvowe1o.png',
    7,
    'This is our darkest, boldest, most developed cup of coffee we offer yet without the bitterness often associated with dark roasted coffee. This coffee is equally enjoyable black or with cream and sugar. You''ll find no judgement here.',
    19.4
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Funky Chicken',
    'Sweet & Smooth',
    'Don''t be surprised if you flap your arms and your feet start kickin'' - this balanced blend brings together an earthy sweetness with a bright plum acidity.',
    'Floyd, VA',
    'Red Rooster',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660244043/solidus/n9bstfdlk9gr0pr4fdle.png',
    7,
    'The Funky Chicken is a crowdpleaser, sweet and balanced enough to drink black, intense and strong enough to stand up to cream, with an exceptionally clean and sweet finish.',
    17.9
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Família Peixoto',
    'Sweet & Smooth',
    'A lusciously creamy body and cozy sweetness make this coffee a hug in a mug, with just a hint of citrus aromatics to keep things interesting.',
    'Chandler, AZ',
    'Peixoto',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660154227/solidus/njv69n0mnnndfvfsod1y.png',
    6,
    'This coffee is the go-to lot of our current-harvest Peixoto family coffees.  Rich flavors of berries, chocolate and nuts identify it as a high-quality Brazil.  With a sweet, clean, and rich flavor profile, this coffee pleases just about everyone.',
    22.7
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Canopy',
    'Sweet & Smooth',
    'A deep black cherry sweetness peeks through this coffee''s pronounced dark chocolate and cinnamon notes.',
    'Nashville, TN',
    'Common Voice',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1663185414/solidus/xw8crsq1xams1qcgds4b.png',
    6,
    'Rise above it all with this rich, dark roast with a strong,complex flavor from Latin America. Deliciously aromatic, ahint of Chocolate, a touch of Spice, and notes of Caramelwill lift your spirits when you need to go bold.',
    25.85
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Bom Senso',
    'Comforting & Rich',
    'With a big, chocolaty body, cozy roasted almond nuttiness and tons of balanced caramel sweetness, this Trade-exclusive cup is just about as comforting as you can get.',
    'Denver, CO',
    'Huckleberry',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660249589/solidus/rkbqu9yice0f4nuuis7x.png',
    8,
    'Bom Senso is a Trade-exclusive, traditional coffee. We source straightforward coffees from Latin America, and roast them a bit darker (for Huckleberry, at least) to create a big, bold cup for the dark roast lovers out there.',
    18.4
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'High Five Blend',
    'Comforting & Rich',
    'With its huge body, chocolaty sweetness, and merest hint of orange acidity, this coffee''s ready to become your own personal cheerleader.',
    'Grand Rapids, MI',
    'Sparrows',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660256746/solidus/ws4dpc8rbmpft6ypixkp.png',
    7,
    'High fives for all from the Mitten State, because making it out of bed in the morning is cause enough for celebration. Don''t leave yourself hanging.',
    25.2
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'City Blend',
    'Balanced & Fruity',
    'Sweet balance found in soft citrus acidity and toffee sweetness. So smooth and poetic, we had to write a haiku.',
    'New York, NY',
    'Oren''s',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660246520/solidus/oizqvvw0c5pa3ojeq5uu.png',
    5,
    'The City Blend is our lightest roast. It is blended from two fine varietals - They''re not just blend half-and-half. Rather, they''re blended in a 70%, 30% proportion.The special proportions of this blend create a surprising complexity to this medium-bodied coffee',
    21.8
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Oren''s Special Blend',
    'Comforting & Rich',
    'Comforting and rich, with a full body and a deep molasses sweetness. Notes of milk chocolate and dried plum stand out in this supremely cozy cup.',
    'New York, NY',
    'Oren''s',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660249279/solidus/ksnt8divqkhpneqaphhr.png',
    8,
    'Our House Blend has a unique sweetness that is enhanced by its full body. The cup is complex, yet smooth. Intriguing. Full of flavor subtleties such that people come to enjoy this coffee more each time.',
    18.65
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Enchanted',
    'Comforting & Rich',
    'Chocolaty sweetness and a kiss of roast make for a magically cozy cup.',
    'Canton, GA',
    'Alma',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660250858/solidus/rqj2vy4wuxvsyxgoguvn.png',
    7,
    'Are you ENCHANTED by dark roast coffee? We can''t help but obsess over this deliciously bold cup of coffee! Strong and bold, with no lingering aftertaste. We recommend drinking enchanted hot or over ice to enjoy its strong notes of creamy dark chocolate, molasses, and toasted pecans.',
    21.55
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Compass',
    'Sweet & Smooth',
    'Chocolate and almond butter sweetness for days - this cup offers that classic candy bar profile, with a hint of juicy tangerine acidity.',
    'Nashville, TN',
    'Common Voice',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1663185428/solidus/kn1nfcecmutcqeieijyp.png',
    5,
    'A gentle, medium roast from South America brings out the unique flavor from beans harvestedby farmers who truly listen to their land. Roasted just longenough to develop a full-bodied richness, this blend is theperfect middle ground when you crave a hint of sweetnessand a slightly stronger brew.',
    17.75
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Black Bear Blend',
    'Comforting & Rich',
    'Deeply sweet and chocolaty, with a kiss of roastiness pairing beautifully with notes of toasted walnut.',
    'Bentonville, AR',
    'Airship',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660237550/solidus/fdaeef3wch3cnmzqommf.png',
    7,
    'A lot can be (and has been) said about dark roasted coffee. This is the only coffee we profile by roast color. But we don''t just turn coffee dark by roasting it longer. We pay close attention to Black Bear by selecting the best coffee and roasting it carefully so it retains its sweetness. Black Bear is complex, velvety, and roasted darker to bring out a rich body.',
    25.45
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Washington Blend',
    'Comforting & Rich',
    'Caramely sweetness, a rich dark chocolaty body, and just a hint of roastiness make this coffee a perfect daily driver.',
    'Portland, OR',
    'Sterling',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660252185/solidus/yrxg7qw13ultxcqom87v.png',
    7,
    'Composed of top quality Central and South American beans, the Washington is sourced and roasted to taste like the coffee our country grew up drinking. With classic flavors like rich chocolate, caramel, and a hint of toasted nuts, Washington will get you across the Delaware (or at least it’ll get you to work).',
    25.1
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Big City',
    'Roasty & Smoky',
    'Full-bodied and rich, this roasty cup offers up plenty of honeycomb sweetness with all that deep, dark chocolate.',
    'New York, NY',
    'Joe',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660259254/solidus/zy907kq1xvmzafzj4jjo.png',
    9,
    'Sturdy and sweet, utilitarian and enjoyable, this is a coffee that holds its own in the big city. This French Roast features deep and comforting flavors of burnt sugar, chocolate, and roasted nuts— a classic profile which will appeal to any dark roast lover.',
    24.4
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    '71 House Blend',
    'Sweet & Smooth',
    'This signature House Blend was crafted as the hallmark coffee for Irving''s original cafe at 71 Irving Place. Classic, rich, smooth flavors are great with milk.',
    'New York, NY',
    'Irving Farm',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1661179176/solidus/nien9l92dj3bis3vbvof.png',
    6,
    'Our signature House Blend was created as the hallmark coffee for our original cafe at 71 Irving Place. The blend has a chocolate, round, and smooth flavor.',
    19.65
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Los Altos',
    'Sweet & Inviting',
    'Sweet, almondy, and fudgy with a rich body that is complemented by a splash of juicy cherry acidity.',
    'Cambridge, MA',
    'Broadsheet',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1666731906/solidus/vygchopku5wsz0slzyld.png',
    6,
    'This community lot was compiled by the UCANOCH Cooperative in Chiapas, who many programs that ensure consistency and quality season after season. Chiapas is a hub of coffee production in Mexico, despite its small geographic size; this lot is a great example of this quality in product, and processing practices. If you''re a fan of traditional coffee profiles, this will be a very satisfying option to try.',
    23.15
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Vista Hermosa',
    'Sweet & Tart',
    'Bright and juicy citrus acidity is upfront is tempered by a pleasant chocolate-cherry sweetness that keeps things balanced.',
    'Grand Rapids, MI',
    'Madcap',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1663337155/solidus/cdjp27he2e9laxjhmxsq.png',
    6,
    'We first met Luis Reinoso in 2010, and have been buying his coffee ever since. Luis produces coffee in a collaborative effort with his wife, Yenni. Luis and Yenni operate on a small 4 hectare farm in the remote valley Herrera, Tolima where the young farmers do the processing while older more experienced farmers do the sorting. This coffee is a washed processed, blend of Caturra and Bourbon varieties grown in the Tolima region of Columbia.',
    20.65
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Guatemala Los Santos',
    'Sweet & Inviting',
    'Zippy citrus acidity up fronts fades into a rich and creamy chocolaty-nutty sweetness, complemented by a velvety smooth body.',
    'Sacramento, CA',
    'Temple',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1662048122/solidus/q97ni99om6w03oau589n.png',
    6,
    'This medium bodied coffee is well balanced in flavor, giving notes of light lemon zest, rich milk chocolate, and sweetly tart cherry. The coffee culminates in a slight lingering finish.',
    23.55
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Space Cadet',
    'Sweet & Smooth',
    'Extra smooth, extra chocolaty-sweet, and dare we say...extraterrestrial? A splash of ripe cherry juiciness makes this crowd-pleasing cup every bit as delicious hot as it is cold.',
    'Salem, MA',
    'Atomic',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660252994/solidus/yexgs5ujizmhmdworj36.png',
    6,
    'A long time ago in a galaxy far, far away... the perfect blend of coffees for cold brew was born. But a Space Cadet isn’t bound by the rules of any world but their own, so you can brew this blend up however you’d like! Our team tastes notes of clementine, nougat and burnt sugar.',
    16.2
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Organic Toketee',
    'Sweet & Smooth',
    'You’re fancy, huh? So is this elevated take on the classic drip, blend. It’s carefully curated, seasonally rotating, and of course—cultured.',
    'San Francisco, CA',
    'Sightglass',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660237060/solidus/yzunwaqvohkhpn2nqzdz.png',
    7,
    'Toketee is an elevated take on the classic drip blend, showcasing carefully curated, seasonally rotating coffees from Central and South America.',
    18.3
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Toni',
    'Sweet & Smooth',
    'A chocolaty sweetness shines throughout this coffee, with a hints of fruit adding complexity and a big, sticky body bringing it all together.',
    'Atlanta, GA',
    'Portrait',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660690635/solidus/eynpm97ehb90dkdlgezp.png',
    6,
    'An unapologetically chocolate coffee with nutty tones. Inspired by the acclaimed author, Toni Morrison.',
    21.4
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Power & Glory Blend',
    'Balanced & Fruity',
    'Feel the power of hazelnutty sweetness and a hefty body meet the glory of citrus aromatics and notes of fresh fruit.',
    'Redding, CA',
    'Feast',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660245836/solidus/ex1giuudofdtotatuwp9.png',
    6,
    'Flavor notes of Hazelnut and nectarine team up with dark chocolate in this sweet, full bodied coffee. With mellow acidity and round body, it’s morning glory in cup.',
    20.9
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'H.O.M.E.S. Blend',
    'Roasty & Smoky',
    'Rich, full-bodied, and extra-dark, this one reminds us of a campfire - maybe on the beach of one of the Great Lakes it''s named for.',
    'Grand Rapids, MI',
    'Sparrows',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1660250044/solidus/ffwvil7ioo6j0hjrn3s1.png',
    8,
    'Fill your cup with this craveably classic blend, with flavors deeper than Lake Superior that linger longer than Michigan winters. Never has an acronym tasted so good.',
    17.1
  );

INSERT INTO
  coffee (
    id,
    name,
    flavor,
    description,
    location,
    roaster,
    imageURL,
    roastLevel,
    roasterNotes,
    price
  )
VALUES
  (
    nextval ('hibernate_sequence'),
    'Blush Berry: Rwanda Sholi Natural',
    'Funky & Fruity',
    'A deliciously syrupy blackberry note permeates this aptly named Rwandan cup, complemented by hints of stone fruit and a milk-chocolaty finish.',
    'Seattle, WA',
    'Caffe Vita',
    'https://res.cloudinary.com/roastcollective/image/upload/h_1000,w_1000,f_auto,fl_progressive:steep,q_auto:good/v1665605684/solidus/i3kvsuct9anxsnj4xed5.png',
    6,
    'Punchy and vibrant, the Natural Process Rwanda has distinct red fruit qualities - hence the name ''Blush Berry''. Expect flavors of blackberry, plum and vanilla and aromas of chocolate, spice, and blackberry.',
    24.75
  );
