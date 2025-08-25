import logoInicial from "../assets/inicio-logo.png";
import whiteArrow from "../assets/white-arrow.png";

function Start() {
  return (
    <div className="flex flex-col items-center justify-center h-200">
      <img src={logoInicial} alt="Logo inicial" className="w-92 h-auto" />
      <button className="cursor-pointer shadow-lg bg-black text-white my-8 items-center flex justify-around w-32 p-3 rounded-xl transition-all ease-in-out delay-75  hover:scale-110">
        <span className="text-2xl font-medium">Entrar</span>
        <img src={whiteArrow} alt="Seta branca" className="h-5" />
      </button>
    </div>
  );
}

export default Start;
