package app.chalo.home.ui.chalobus;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.scenes.ChaloNavigationManagerKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class PremiumBusTutorialScreenKt$PremiumBusTutorialScreen$1$1 extends FunctionReferenceImpl implements Function1<PremiumBusTutorialViewIntent, Unit> {
    public final void g(PremiumBusTutorialViewIntent p0) {
        Intrinsics.i(p0, "p0");
        PremiumBusTutorialComponent premiumBusTutorialComponent = (PremiumBusTutorialComponent) this.receiver;
        premiumBusTutorialComponent.getClass();
        premiumBusTutorialComponent.C0(p0);
        if (p0.equals(PremiumBusTutorialViewIntent.BackClicked.f3295a)) {
            ChaloNavigationManagerKt.c(premiumBusTutorialComponent.k);
            return;
        }
        if (!(p0 instanceof PremiumBusTutorialViewIntent.TutorialClicked)) {
            throw new NoWhenBranchMatchedException();
        }
        PremiumBusTutorialViewIntent.TutorialClicked tutorialClicked = (PremiumBusTutorialViewIntent.TutorialClicked) p0;
        AnalyticsContract analyticsContract = premiumBusTutorialComponent.o;
        Source source = Source.PREMIUM_BUS_TUTORIAL_SCREEN;
        PremiumBusTutorialConfigUiModel premiumBusTutorialConfigUiModel = tutorialClicked.f3296a;
        AnalyticsContractImplKt.b(analyticsContract, "pb tutorial clicked", source, MapsKt.i(new Pair("tutorial title", premiumBusTutorialConfigUiModel.c), new Pair("tutorial url", premiumBusTutorialConfigUiModel.f3290a)), false, 24);
        BuildersKt.d(premiumBusTutorialComponent.j, null, null, new PremiumBusTutorialComponent$handleTutorialClicked$1(premiumBusTutorialComponent, tutorialClicked, null), 3);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        g((PremiumBusTutorialViewIntent) obj);
        return Unit.f17538a;
    }
}
