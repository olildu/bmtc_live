package defpackage;

import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionIntent;
import app.chalo.scenes.ChaloNavigationManagerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ku0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18257a;
    public final /* synthetic */ PremiumBusProductSelectionComponent b;

    public /* synthetic */ ku0(PremiumBusProductSelectionComponent premiumBusProductSelectionComponent, int i) {
        this.f18257a = i;
        this.b = premiumBusProductSelectionComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18257a) {
            case 0:
                this.b.K0(PremiumBusProductSelectionIntent.OnBackClickIntent.f7696a);
                break;
            case 1:
                this.b.K0(PremiumBusProductSelectionIntent.ToolBarEditBtnClickIntent.f7699a);
                break;
            case 2:
                ChaloNavigationManagerKt.c(this.b.y);
                break;
            default:
                this.b.K0(PremiumBusProductSelectionIntent.ReportProblemClickedIntent.f7698a);
                break;
        }
        return Unit.f17538a;
    }
}
