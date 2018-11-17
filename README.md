# SWEN2018
A repository for  teaching the concepts of DevOps - Software Management Course
## Branching
#### Legend
<table>
  <thead>
    <tr>
      <th>Branch Name</th>
      <th>Branch</th>
      <th>Description, Instructions, Notes</th>
      <th>Branch off from</th>
      <th>Merge Back Into</th>
      <th>Naming Convention:</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Feature</td>
      <td>Feature Development</td>
      <td>Accepts merges from Working and Hotfixes</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>Working</td>
      <td>master</td>
      <td>Accepts merges from Features/Issues and Hotfixes</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>Features/Issues</td>
      <td>topic-*</td>
      <td>Always branch off HEAD of Working</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>Hotfix</td>
      <td>hotfix-*</td>
      <td>Always branch off Stable</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
  </tbody>
</table>

## Workflow Diagram

![Git Branching Model](http://f.cl.ly/items/3i1Z3n1T1k392r1A3Q0m/gitflow-model.001.png)  
*[gitflow-model.src.key](http://cl.ly/3V1b0c2F1H4024173S1M)*
