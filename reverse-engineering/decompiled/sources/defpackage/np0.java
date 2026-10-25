package defpackage;

import app.chalo.productpurchase.passselection.ui.PassSelectionComponent;
import app.chalo.productpurchase.passselection.ui.PassSelectionDataState;
import app.chalo.productpurchase.passselection.ui.PassSelectionIntent;
import app.chalo.productpurchase.passselection.ui.PassSelectionRestoreState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class np0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18534a;
    public final /* synthetic */ PassSelectionComponent b;

    public /* synthetic */ np0(PassSelectionComponent passSelectionComponent, int i) {
        this.f18534a = i;
        this.b = passSelectionComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18534a) {
            case 0:
                PassSelectionDataState passSelectionDataState = (PassSelectionDataState) this.b.f.getValue();
                Intrinsics.i(passSelectionDataState, "<this>");
                return new PassSelectionRestoreState(passSelectionDataState.f8533a, passSelectionDataState.b, passSelectionDataState.c, passSelectionDataState.d);
            default:
                this.b.N0(PassSelectionIntent.BackClickedIntent.f8534a);
                return Unit.f17538a;
        }
    }
}
