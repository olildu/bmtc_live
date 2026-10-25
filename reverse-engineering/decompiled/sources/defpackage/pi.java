package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScope;
import app.chalo.compose.utils.ContentAnimationTransitionSpecKt;
import app.chalo.ncmc.ui.cardlinking.linking.CardLinkingErrorType;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkViewState;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountErrorType;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountLayoutType;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountViewState;
import app.chalo.ncmc.ui.landing.CardInfoLandingScreenBottomSheetType;
import app.chalo.ncmc.ui.landing.ChaloCardInfoDetailScreenLayoutType;
import app.chalo.ncmc.ui.landing.ChaloCardInfoScreenLayoutType;
import app.chalo.ncmc.ui.landing.ChaloCardInfoViewState;
import app.chalo.ncmc.ui.landing.ConfirmationDialogType;
import app.chalo.ncmc.ui.landing.FetchCardStatus;
import app.chalo.ncmc.ui.landing.compose.ChaloCardInfoScreenKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pi implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19038a;

    public /* synthetic */ pi(int i) {
        this.f19038a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19038a) {
            case 0:
                ChaloCardInfoViewState it = (ChaloCardInfoViewState) obj;
                Intrinsics.i(it, "it");
                return ChaloCardInfoViewState.a(it, null, null, false, 0, null, null, null, null, ChaloCardInfoScreenLayoutType.ALL_CARDS, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388351);
            case 1:
                ChaloCardInfoViewState it2 = (ChaloCardInfoViewState) obj;
                Intrinsics.i(it2, "it");
                return ChaloCardInfoViewState.a(it2, null, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, true, ConfirmationDialogType.UNLINK_CARD, false, null, false, null, false, 8191999);
            case 2:
                ChaloCardInfoViewState it3 = (ChaloCardInfoViewState) obj;
                Intrinsics.i(it3, "it");
                return ChaloCardInfoViewState.a(it3, null, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, false, 8323071);
            case 3:
                ChaloCardInfoViewState it4 = (ChaloCardInfoViewState) obj;
                Intrinsics.i(it4, "it");
                return ChaloCardInfoViewState.a(it4, null, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, CardInfoLandingScreenBottomSheetType.NfcTapUnavailable.f6340a, false, 6291455);
            case 4:
                ChaloCardInfoViewState it5 = (ChaloCardInfoViewState) obj;
                Intrinsics.i(it5, "it");
                return ChaloCardInfoViewState.a(it5, null, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, true, ConfirmationDialogType.BLOCK_CARD, false, null, false, null, false, 8191999);
            case 5:
                ChaloCardInfoViewState it6 = (ChaloCardInfoViewState) obj;
                Intrinsics.i(it6, "it");
                return ChaloCardInfoViewState.a(it6, null, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, false, 8323071);
            case 6:
                ChaloCardInfoViewState it7 = (ChaloCardInfoViewState) obj;
                Intrinsics.i(it7, "it");
                return ChaloCardInfoViewState.a(it7, null, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, false, 8386559);
            case 7:
                return ChaloCardInfoViewState.a((ChaloCardInfoViewState) obj, null, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388603);
            case 8:
                return ChaloCardInfoViewState.a((ChaloCardInfoViewState) obj, null, null, false, 0, null, null, null, FetchCardStatus.FETCHING, null, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388479);
            case 9:
                return ChaloCardInfoViewState.a((ChaloCardInfoViewState) obj, null, null, false, 0, null, null, null, FetchCardStatus.FETCH_FAILED, null, null, false, null, null, null, null, false, null, false, null, false, null, false, 8386427);
            case 10:
                return ChaloCardInfoViewState.a((ChaloCardInfoViewState) obj, null, null, false, 0, null, null, null, FetchCardStatus.FETCH_FAILED, null, null, true, null, null, null, null, false, null, false, null, false, null, false, 8386427);
            case 11:
                return ChaloCardInfoViewState.a((ChaloCardInfoViewState) obj, null, null, false, 0, null, null, null, FetchCardStatus.FETCHED_AND_NO_CARD_AVAILABLE, ChaloCardInfoScreenLayoutType.ALL_CARDS, null, false, null, null, null, null, false, null, false, null, false, null, false, 8386171);
            case 12:
                return ChaloCardInfoViewState.a((ChaloCardInfoViewState) obj, null, null, true, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388603);
            case 13:
                return ChaloCardInfoViewState.a((ChaloCardInfoViewState) obj, null, null, false, 0, null, null, null, null, null, ChaloCardInfoDetailScreenLayoutType.CARD_INFO, false, null, null, null, null, false, null, false, null, false, null, false, 8388091);
            case 14:
                return ChaloCardInfoViewState.a((ChaloCardInfoViewState) obj, null, null, false, 0, null, null, null, null, null, ChaloCardInfoDetailScreenLayoutType.CARD_INFO, false, null, null, null, null, false, null, false, null, false, null, false, 8388091);
            case 15:
                return ChaloCardInfoViewState.a((ChaloCardInfoViewState) obj, null, null, true, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388603);
            case 16:
                return ChaloCardInfoViewState.a((ChaloCardInfoViewState) obj, null, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388603);
            case 17:
                return ChaloCardInfoViewState.a((ChaloCardInfoViewState) obj, null, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388603);
            case 18:
                return ChaloCardInfoViewState.a((ChaloCardInfoViewState) obj, null, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388595);
            case 19:
                return ChaloCardInfoViewState.a((ChaloCardInfoViewState) obj, null, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388603);
            case 20:
                AnimatedContentTransitionScope AnimatedContent = (AnimatedContentTransitionScope) obj;
                Intrinsics.i(AnimatedContent, "$this$AnimatedContent");
                int i = ChaloCardInfoScreenKt.WhenMappings.b[((ChaloCardInfoScreenLayoutType) AnimatedContent.getTargetState()).ordinal()];
                if (i == 1 || i == 2) {
                    return ContentAnimationTransitionSpecKt.a(AnimatedContent);
                }
                if (i == 3) {
                    return ContentAnimationTransitionSpecKt.b(AnimatedContent);
                }
                throw new NoWhenBranchMatchedException();
            case 21:
                ChaloCardLinkViewState it8 = (ChaloCardLinkViewState) obj;
                Intrinsics.i(it8, "it");
                return ChaloCardLinkViewState.a(it8, null, null, false, true, null, false, null, null, 0, 0, 0, 0, false, 4055);
            case 22:
                ChaloCardLinkViewState it9 = (ChaloCardLinkViewState) obj;
                Intrinsics.i(it9, "it");
                return ChaloCardLinkViewState.a(it9, "", "", false, false, CardLinkingErrorType.INVALID_CARD_NUMBER, false, "", null, 0, 0, 0, 0, false, 3968);
            case 23:
                ChaloCardLinkViewState it10 = (ChaloCardLinkViewState) obj;
                Intrinsics.i(it10, "it");
                return ChaloCardLinkViewState.a(it10, "", "", false, false, CardLinkingErrorType.NO_ERROR, false, null, null, 0, 0, 0, 0, false, 4036);
            case 24:
                return ChaloCardLinkViewState.a((ChaloCardLinkViewState) obj, null, null, false, false, CardLinkingErrorType.NO_ERROR, false, null, null, 0, 0, 0, 0, false, 4039);
            case 25:
                ChaloCardRechargeAmountViewState it11 = (ChaloCardRechargeAmountViewState) obj;
                Intrinsics.i(it11, "it");
                return ChaloCardRechargeAmountViewState.a(it11, null, null, null, null, null, 0L, null, null, null, null, false, true, null, null, null, null, null, false, null, 2093055);
            case 26:
                ChaloCardRechargeAmountViewState it12 = (ChaloCardRechargeAmountViewState) obj;
                Intrinsics.i(it12, "it");
                return ChaloCardRechargeAmountViewState.a(it12, null, null, null, null, null, 0L, "", null, null, CardRechargeAmountErrorType.NoError.f6284a, false, false, null, null, null, null, null, false, null, 2093887);
            case 27:
                ChaloCardRechargeAmountViewState it13 = (ChaloCardRechargeAmountViewState) obj;
                Intrinsics.i(it13, "it");
                return ChaloCardRechargeAmountViewState.a(it13, null, null, null, null, null, 0L, null, null, null, null, false, false, null, null, null, null, null, false, null, 1572863);
            case 28:
                ChaloCardRechargeAmountViewState it14 = (ChaloCardRechargeAmountViewState) obj;
                Intrinsics.i(it14, "it");
                return ChaloCardRechargeAmountViewState.a(it14, null, null, null, null, null, 0L, null, null, null, null, false, false, null, null, null, null, null, false, null, 2093055);
            default:
                ChaloCardRechargeAmountViewState it15 = (ChaloCardRechargeAmountViewState) obj;
                Intrinsics.i(it15, "it");
                return ChaloCardRechargeAmountViewState.a(it15, null, null, null, null, null, 0L, null, null, CardRechargeAmountLayoutType.EnterAmountLayout.f6285a, null, false, false, null, null, null, null, null, false, null, 2096639);
        }
    }
}
