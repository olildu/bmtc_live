package defpackage;

import app.chalo.reportproblem.ReportProblemComponent;
import app.chalo.reportproblem.ReportProblemIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m21 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18365a;
    public final /* synthetic */ ReportProblemComponent b;

    public /* synthetic */ m21(ReportProblemComponent reportProblemComponent, int i) {
        this.f18365a = i;
        this.b = reportProblemComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18365a) {
            case 0:
                this.b.K0(ReportProblemIntent.ReclaimRequestDialogPositiveBtnClicked.f9025a);
                break;
            case 1:
                this.b.K0(ReportProblemIntent.ReclaimRequestDialogNegativeBtnClicked.f9024a);
                break;
            case 2:
                this.b.E0(new g11(13));
                break;
            case 3:
                this.b.K0(ReportProblemIntent.OnBackPressed.f9022a);
                break;
            case 4:
                this.b.K0(ReportProblemIntent.ReclaimResponseDialogPositiveBtnClickedWithAutoLink.f9027a);
                break;
            case 5:
                this.b.K0(ReportProblemIntent.ReclaimResponseDialogPositiveBtnClickedWithoutAutoLink.f9028a);
                break;
            default:
                this.b.K0(ReportProblemIntent.ReclaimResponseDialogNegativeBtnClicked.f9026a);
                break;
        }
        return Unit.f17538a;
    }
}
