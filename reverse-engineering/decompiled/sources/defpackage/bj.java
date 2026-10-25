package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScope;
import app.cash.sqldelight.TransactionWithoutReturn;
import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.compose.utils.ContentAnimationTransitionSpecKt;
import app.chalo.features.chaloconfig.data.exception.ChaloConfigFetchException;
import app.chalo.features.chalotime.data.exception.ChaloTimeFetchFailedException;
import app.chalo.location.LatLng;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountLayoutType;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeDataFetchErrorReason;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountViewState;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.uistate.components.map.ChaloMapUIEventHandler;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonBuilder;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11201a;

    public /* synthetic */ bj(int i) {
        this.f11201a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.f11201a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                ChaloCardRechargeAmountViewState it = (ChaloCardRechargeAmountViewState) obj;
                Intrinsics.i(it, "it");
                return ChaloCardRechargeAmountViewState.a(it, null, null, null, null, null, 0L, null, null, new CardRechargeAmountLayoutType.ErrorLayout(CardRechargeDataFetchErrorReason.CARD_DETAILS_FETCH_FAILED), null, false, false, null, null, null, null, null, false, null, 2096639);
            case 1:
                ChaloCardRechargeAmountViewState it2 = (ChaloCardRechargeAmountViewState) obj;
                Intrinsics.i(it2, "it");
                return ChaloCardRechargeAmountViewState.a(it2, null, null, null, null, null, 0L, null, null, new CardRechargeAmountLayoutType.ErrorLayout(CardRechargeDataFetchErrorReason.NO_LINKED_CARD_FOUND), null, false, false, null, null, null, null, null, false, null, 2096639);
            case 2:
                ChaloCardRechargeAmountViewState it3 = (ChaloCardRechargeAmountViewState) obj;
                Intrinsics.i(it3, "it");
                return ChaloCardRechargeAmountViewState.a(it3, null, null, null, null, null, 0L, null, null, new CardRechargeAmountLayoutType.ErrorLayout(CardRechargeDataFetchErrorReason.RECHARGE_CONFIG_FETCH_FAILED), null, false, false, null, null, null, null, null, false, null, 2096639);
            case 3:
                ChaloCardRechargeAmountViewState it4 = (ChaloCardRechargeAmountViewState) obj;
                Intrinsics.i(it4, "it");
                return ChaloCardRechargeAmountViewState.a(it4, null, null, null, null, null, 0L, null, null, new CardRechargeAmountLayoutType.ErrorLayout(CardRechargeDataFetchErrorReason.RECHARGE_CONFIG_FETCH_FAILED), null, false, false, null, null, null, null, null, false, null, 2096639);
            case 4:
                ChaloCardRechargeAmountViewState it5 = (ChaloCardRechargeAmountViewState) obj;
                Intrinsics.i(it5, "it");
                return ChaloCardRechargeAmountViewState.a(it5, null, null, null, null, null, 0L, null, null, new CardRechargeAmountLayoutType.ErrorLayout(CardRechargeDataFetchErrorReason.NO_ACTIVE_RECHARGE_CONFIG_AVAILABLE), null, false, false, null, null, null, null, null, false, null, 2096639);
            case 5:
                return ChaloCardRechargeAmountViewState.a((ChaloCardRechargeAmountViewState) obj, null, null, null, null, null, 0L, null, null, CardRechargeAmountLayoutType.FullScreenLoadingLayout.f6287a, null, false, false, null, null, null, null, null, false, null, 2096639);
            case 6:
                return ChaloCardRechargeAmountViewState.a((ChaloCardRechargeAmountViewState) obj, null, null, null, null, null, 0L, null, null, CardRechargeAmountLayoutType.RechargeSuccess.f6288a, null, false, false, null, null, null, null, null, false, null, 2096639);
            case 7:
                return ChaloCardRechargeAmountViewState.a((ChaloCardRechargeAmountViewState) obj, null, null, null, null, null, 0L, null, null, null, null, false, false, null, null, null, null, null, false, null, 1572863);
            case 8:
                AnimatedContentTransitionScope AnimatedContent = (AnimatedContentTransitionScope) obj;
                Intrinsics.i(AnimatedContent, "$this$AnimatedContent");
                CardRechargeAmountLayoutType cardRechargeAmountLayoutType = (CardRechargeAmountLayoutType) AnimatedContent.getTargetState();
                if (Intrinsics.d(cardRechargeAmountLayoutType, CardRechargeAmountLayoutType.EnterAmountLayout.f6285a) || (cardRechargeAmountLayoutType instanceof CardRechargeAmountLayoutType.ErrorLayout) || Intrinsics.d(cardRechargeAmountLayoutType, CardRechargeAmountLayoutType.FullScreenLoadingLayout.f6287a)) {
                    return ContentAnimationTransitionSpecKt.a(AnimatedContent);
                }
                if (Intrinsics.d(cardRechargeAmountLayoutType, CardRechargeAmountLayoutType.RechargeSuccess.f6288a)) {
                    return ContentAnimationTransitionSpecKt.b(AnimatedContent);
                }
                throw new NoWhenBranchMatchedException();
            case 9:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse == null || (str = genericChaloErrorResponse.b) == null) {
                    str = "Something went wrong";
                }
                return new ChaloConfigFetchException(genericChaloErrorResponse, str);
            case 10:
                TransactionWithoutReturn transaction = (TransactionWithoutReturn) obj;
                Intrinsics.i(transaction, "$this$transaction");
                return unit;
            case 11:
                TransactionWithoutReturn transaction2 = (TransactionWithoutReturn) obj;
                Intrinsics.i(transaction2, "$this$transaction");
                return unit;
            case 12:
                TransactionWithoutReturn transaction3 = (TransactionWithoutReturn) obj;
                Intrinsics.i(transaction3, "$this$transaction");
                return unit;
            case 13:
                TransactionWithoutReturn transaction4 = (TransactionWithoutReturn) obj;
                Intrinsics.i(transaction4, "$this$transaction");
                return unit;
            case 14:
                TransactionWithoutReturn transaction5 = (TransactionWithoutReturn) obj;
                Intrinsics.i(transaction5, "$this$transaction");
                return unit;
            case 15:
                TransactionWithoutReturn transaction6 = (TransactionWithoutReturn) obj;
                Intrinsics.i(transaction6, "$this$transaction");
                return unit;
            case 16:
                TransactionWithoutReturn transaction7 = (TransactionWithoutReturn) obj;
                Intrinsics.i(transaction7, "$this$transaction");
                return unit;
            case 17:
                TransactionWithoutReturn transaction8 = (TransactionWithoutReturn) obj;
                Intrinsics.i(transaction8, "$this$transaction");
                return unit;
            case 18:
                String it6 = (String) obj;
                Intrinsics.i(it6, "it");
                return Boolean.valueOf(it6.length() > 0);
            case 19:
                String it7 = (String) obj;
                Intrinsics.i(it7, "it");
                return Boolean.valueOf(it7.length() > 0);
            case 20:
                JsonBuilder Json = (JsonBuilder) obj;
                ChaloJson chaloJson = ChaloJson.f6455a;
                Intrinsics.i(Json, "$this$Json");
                Json.c = true;
                Json.d = true;
                Json.g = true;
                Json.b = false;
                Json.f18189a = true;
                return unit;
            case 21:
                ChaloMapUIEventHandler.Companion companion = ChaloMapUIEventHandler.Companion.f9961a;
                Intrinsics.i((LatLng) obj, "it");
                return unit;
            case 22:
                Intrinsics.i((MapCameraUpdate) obj, "it");
                return unit;
            case 23:
                Intrinsics.i((LatLng) obj, "it");
                return unit;
            case 24:
                Map.Entry it8 = (Map.Entry) obj;
                Intrinsics.i(it8, "it");
                return it8.getKey() + "=" + it8.getValue();
            case 25:
                return new ChaloTimeFetchFailedException((GenericChaloErrorResponse) obj, false);
            case 26:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("chalo_pay_table");
                return unit;
            case 27:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("chalo_pay_table");
                return unit;
            case 28:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("chalo_pay_table");
                return unit;
            default:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("chalo_pay_table");
                return unit;
        }
    }
}
