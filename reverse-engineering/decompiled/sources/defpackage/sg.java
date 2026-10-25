package defpackage;

import app.chalo.home.ui.chalobus.ChaloBusComponent;
import app.chalo.home.ui.chalobus.ChaloBusViewIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19300a;
    public final /* synthetic */ ChaloBusComponent b;

    public /* synthetic */ sg(ChaloBusComponent chaloBusComponent, int i) {
        this.f19300a = i;
        this.b = chaloBusComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19300a) {
            case 0:
                this.b.Z0(ChaloBusViewIntent.TimePickerContinueBtnClickedIntent.f3282a);
                break;
            case 1:
                this.b.Z0(ChaloBusViewIntent.BottomSheetDismissIntent.f3260a);
                break;
            case 2:
                this.b.Z0(ChaloBusViewIntent.BottomSheetDismissIntent.f3260a);
                break;
            default:
                this.b.E0(new we(21));
                break;
        }
        return Unit.f17538a;
    }
}
