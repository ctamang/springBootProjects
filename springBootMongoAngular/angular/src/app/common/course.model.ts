export class Course {
    id : string;
    constructor(public name: string, public description: string) {
        this.name = name;
        this.description = description;
    }
}