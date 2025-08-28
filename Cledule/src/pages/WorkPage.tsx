import profileProv from "../assets/perfil-prov.png";
import settingsIcon from "../assets/settings.png";
import bellIcon from "../assets/bell.png";
import helpCircleIcon from "../assets/help-circle.png";
import Option from "../components/Option";

function WorkPage() {
  return (
    <div className="flex flex-row relative w-screen h-screen">
      <div className="bg-neutral-200 h-screen w-70 flex flex-col relative">
        <div className="p-4 flex items-center">
          <img src={profileProv} alt="Provisory profile" />
          <div className="ml-5">
            <p className="text-lg font-medium">Seu nome</p>
            <a href="#" className="text-blue-600 border-b-1">
              Perfil
            </a>
          </div>
        </div>
        <hr className="text-zinc-300" />
        <div className="p-2">
          <ul>
            <Option>Página Inicial</Option>
            <Option>Salas</Option>
            <Option>Agenda</Option>
            <Option>Histórico</Option>
            <Option>Gerenciamento</Option>
          </ul>
        </div>
        <hr className="text-zinc-300" />
        <div className="absolute bottom-0 w-full">
          <hr className="text-zinc-300" />
          <div className="flex justify-between items-center">
            <div className="flex p-2 items-baseline-last">
              <img
                src={settingsIcon}
                alt="Settings"
                className="mx-1 h-7 w-auto transition ease-in-out hover:brightness-75 hover:cursor-pointer"
              />
              <img
                src={bellIcon}
                alt="Bell"
                className="mx-1 h-7 w-auto transition ease-in-out hover:brightness-75 hover:cursor-pointer"
              />
              <img
                src={helpCircleIcon}
                alt="Help"
                className="mx-1 h-7 w-auto transition ease-in-out hover:brightness-75 hover:cursor-pointer"
              />
            </div>
            <span className="p-2 text-neutral-400 font-semibold hover:cursor-default">
              Version 1.0
            </span>
          </div>
        </div>
      </div>

      <div className="w-full">
        <div className="border-2 p-8">
          <div className="flex flex-col">
            <input type="text" className="bg-neutral-200 w-1/3 h-10" />
          </div>
        </div>
      </div>
    </div>
  );
}

export default WorkPage;
