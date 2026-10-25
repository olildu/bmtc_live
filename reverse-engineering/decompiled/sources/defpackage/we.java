package defpackage;

import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselPagerState;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.home.ui.chalobus.RidePreferenceBannerState;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryViewState;
import app.chalo.ncmc.utils.CardsJsonKt;
import app.chalo.productsummary.ui.ticket.ProductSummaryBannerCtaType;
import io.ktor.util.CaseInsensitiveString;
import io.ktor.util.TextKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class we implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19919a;

    public /* synthetic */ we(int i) {
        this.f19919a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19919a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                return (String) obj;
            case 1:
                ProductSummaryBannerCtaType it = (ProductSummaryBannerCtaType) obj;
                Intrinsics.i(it, "it");
                return unit;
            case 2:
                ProductSummaryBannerCtaType it2 = (ProductSummaryBannerCtaType) obj;
                Intrinsics.i(it2, "it");
                return unit;
            case 3:
                CardTransactionHistoryViewState it3 = (CardTransactionHistoryViewState) obj;
                Intrinsics.i(it3, "it");
                return CardTransactionHistoryViewState.a(it3, null, null, null, false, null, 28);
            case 4:
                CardTransactionHistoryViewState it4 = (CardTransactionHistoryViewState) obj;
                Intrinsics.i(it4, "it");
                return CardTransactionHistoryViewState.a(it4, null, null, null, false, null, 28);
            case 5:
                CardTransactionHistoryViewState it5 = (CardTransactionHistoryViewState) obj;
                Intrinsics.i(it5, "it");
                return CardTransactionHistoryViewState.a(it5, null, null, null, true, null, 23);
            case 6:
                CardTransactionHistoryViewState it6 = (CardTransactionHistoryViewState) obj;
                Intrinsics.i(it6, "it");
                return CardTransactionHistoryViewState.a(it6, null, null, null, false, null, 23);
            case 7:
                CardTransactionHistoryViewState it7 = (CardTransactionHistoryViewState) obj;
                Intrinsics.i(it7, "it");
                return CardTransactionHistoryViewState.a(it7, null, null, null, false, null, 28);
            case 8:
                JsonBuilder customJson = (JsonBuilder) obj;
                Json json = CardsJsonKt.f6442a;
                Intrinsics.i(customJson, "$this$customJson");
                customJson.h = "_cardType";
                return unit;
            case 9:
                return CarouselKt.Carousel_cJHQLPU$lambda$16$lambda$15((SemanticsPropertyReceiver) obj);
            case 10:
                return CarouselKt.Carousel_cJHQLPU$lambda$18$lambda$17((SemanticsPropertyReceiver) obj);
            case 11:
                return CarouselKt.carouselItem$lambda$26$lambda$22((Placeable.PlacementScope) obj);
            case 12:
                return CarouselPagerState.Saver$lambda$2((List) obj);
            case 13:
                return CarouselState.Saver$lambda$3((List) obj);
            case 14:
                CaseInsensitiveString DelegatingMutableSet = (CaseInsensitiveString) obj;
                Intrinsics.i(DelegatingMutableSet, "$this$DelegatingMutableSet");
                return DelegatingMutableSet.f16886a;
            case 15:
                String DelegatingMutableSet2 = (String) obj;
                Intrinsics.i(DelegatingMutableSet2, "$this$DelegatingMutableSet");
                return TextKt.a(DelegatingMutableSet2);
            case 16:
                ChaloBusViewState it8 = (ChaloBusViewState) obj;
                Intrinsics.i(it8, "it");
                return ChaloBusViewState.a(it8, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435447);
            case 17:
                ChaloBusViewState it9 = (ChaloBusViewState) obj;
                Intrinsics.i(it9, "it");
                return ChaloBusViewState.a(it9, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435327);
            case 18:
                ChaloBusViewState it10 = (ChaloBusViewState) obj;
                Intrinsics.i(it10, "it");
                return ChaloBusViewState.a(it10, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435447);
            case 19:
                ChaloBusViewState state = (ChaloBusViewState) obj;
                Intrinsics.i(state, "state");
                return ChaloBusViewState.a(state, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435451);
            case 20:
                ChaloBusViewState it11 = (ChaloBusViewState) obj;
                Intrinsics.i(it11, "it");
                return ChaloBusViewState.a(it11, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, RidePreferenceBannerState.Hidden.f3301a, null, null, null, 251650047);
            case 21:
                ChaloBusViewState it12 = (ChaloBusViewState) obj;
                Intrinsics.i(it12, "it");
                return ChaloBusViewState.a(it12, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435453);
            case 22:
                ChaloBusViewState it13 = (ChaloBusViewState) obj;
                Intrinsics.i(it13, "it");
                return ChaloBusViewState.a(it13, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435447);
            case 23:
                ChaloBusViewState it14 = (ChaloBusViewState) obj;
                Intrinsics.i(it14, "it");
                return ChaloBusViewState.a(it14, null, true, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435453);
            case 24:
                ChaloBusViewState it15 = (ChaloBusViewState) obj;
                Intrinsics.i(it15, "it");
                return ChaloBusViewState.a(it15, null, false, 0, null, null, null, it15.i, it15.h, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268434687);
            case 25:
                return ChaloBusViewState.a((ChaloBusViewState) obj, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 267911167);
            case 26:
                return ChaloBusViewState.a((ChaloBusViewState) obj, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268369919);
            case 27:
                return ChaloBusViewState.a((ChaloBusViewState) obj, null, true, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435453);
            case 28:
                return ChaloBusViewState.a((ChaloBusViewState) obj, null, true, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435453);
            default:
                return ChaloBusViewState.a((ChaloBusViewState) obj, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 268435445);
        }
    }
}
