import logoInicial from "../assets/inicio-logo.png";
import whiteArrow from "../assets/white-arrow.png";

function Start() {
  return (
    <div className="flex flex-col items-center justify-center h-200">
      <img src={logoInicial} alt="Logo inicial" className="w-92 h-auto" />
      <button className="cursor-pointer bg-black my-8 items-center flex justify-around w-32 p-3 rounded-xl">
        <span className="text-white text-2xl font-medium">Entrar</span>
        <img
          src={whiteArrow}
          alt="Seta branca"
          className="h-5 border-b-emerald-600"
        />
      </button>
    </div>
  );
}

export default Start;
