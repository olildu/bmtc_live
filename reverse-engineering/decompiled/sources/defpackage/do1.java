package defpackage;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.validationsdk.vehiclebasedvalidation.data.remote.OndcTicketReceiptFetchFailedException;
import app.chalo.validationsdk.vehiclebasedvalidation.data.remote.VehicleBasedValidationRemoteDataSource;
import app.chalo.validationsdk.vehiclebasedvalidation.data.repository.VehicleBasedValidationRepository;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsState;
import app.chalo.wallet.ui.loadbalance.SuggestAmountsDenominations;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountDataState;
import app.chalo.wallet.ui.mainbalance.WalletBalanceDataState;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class do1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15482a;

    public /* synthetic */ do1(int i) {
        this.f15482a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15482a) {
            case 0:
                return VectorConvertersKt.IntOffsetToVector$lambda$0((IntOffset) obj);
            case 1:
                return VectorConvertersKt.IntOffsetToVector$lambda$1((AnimationVector2D) obj);
            case 2:
                return VectorConvertersKt.IntSizeToVector$lambda$0((IntSize) obj);
            case 3:
                return VectorConvertersKt.IntSizeToVector$lambda$1((AnimationVector2D) obj);
            case 4:
                return VectorConvertersKt.RectToVector$lambda$0((Rect) obj);
            case 5:
                return VectorConvertersKt.RectToVector$lambda$1((AnimationVector4D) obj);
            case 6:
                return Float.valueOf(((AnimationVector1D) obj).getValue());
            case 7:
                BeanDefinition factoryOf = (BeanDefinition) obj;
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(VehicleBasedValidationRemoteDataSource.class), factoryOf.f);
                return Unit.f17538a;
            case 8:
                BeanDefinition factoryOf2 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf2, "$this$factoryOf");
                factoryOf2.f = CollectionsKt.d0(Reflection.a(VehicleBasedValidationRepository.class), factoryOf2.f);
                return Unit.f17538a;
            case 9:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new OndcTicketReceiptFetchFailedException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 10:
                WalletAllTransactionsState it = (WalletAllTransactionsState) obj;
                Intrinsics.i(it, "it");
                return WalletAllTransactionsState.a(it, null, null, false, false, null, false, false, 191);
            case 11:
                WalletAllTransactionsState it2 = (WalletAllTransactionsState) obj;
                Intrinsics.i(it2, "it");
                return WalletAllTransactionsState.a(it2, null, null, false, false, null, true, false, 191);
            case 12:
                WalletAllTransactionsState currentState = (WalletAllTransactionsState) obj;
                Intrinsics.i(currentState, "currentState");
                return WalletAllTransactionsState.a(currentState, null, null, true, true, null, false, false, 227);
            case 13:
                WalletBalanceDataState it3 = (WalletBalanceDataState) obj;
                Intrinsics.i(it3, "it");
                return WalletBalanceDataState.a(it3, false, null, false, null, null, 0, 0, null, false, false, null, true, null, 12287);
            case 14:
                WalletBalanceDataState it4 = (WalletBalanceDataState) obj;
                Intrinsics.i(it4, "it");
                return WalletBalanceDataState.a(it4, false, null, false, null, null, 0, 0, null, false, false, null, false, null, 12287);
            case 15:
                WalletBalanceDataState it5 = (WalletBalanceDataState) obj;
                Intrinsics.i(it5, "it");
                return WalletBalanceDataState.a(it5, true, null, false, null, null, 0, 0, null, false, false, null, false, null, 16382);
            case 16:
                WalletBalanceDataState it6 = (WalletBalanceDataState) obj;
                Intrinsics.i(it6, "it");
                return WalletBalanceDataState.a(it6, false, null, false, null, null, 0, 0, null, false, false, null, false, null, 14835);
            case 17:
                WalletBalanceDataState it7 = (WalletBalanceDataState) obj;
                Intrinsics.i(it7, "it");
                return WalletBalanceDataState.a(it7, false, null, true, null, null, 0, 0, null, false, false, null, false, null, 14839);
            case 18:
                WalletBalanceDataState state = (WalletBalanceDataState) obj;
                Intrinsics.i(state, "state");
                return WalletBalanceDataState.a(state, false, null, false, EmptyList.f17557a, null, 0, 0, null, false, false, null, false, null, 14689);
            case 19:
                WalletBalanceDataState it8 = (WalletBalanceDataState) obj;
                Intrinsics.i(it8, "it");
                return WalletBalanceDataState.a(it8, false, null, false, null, null, 0, 0, null, true, true, null, false, null, 14847);
            case 20:
                WalletBalanceDataState it9 = (WalletBalanceDataState) obj;
                Intrinsics.i(it9, "it");
                return WalletBalanceDataState.a(it9, false, null, false, null, null, 0, 0, null, true, false, null, false, null, 14847);
            case 21:
                WalletLoadBalanceEnterAmountDataState it10 = (WalletLoadBalanceEnterAmountDataState) obj;
                Intrinsics.i(it10, "it");
                return WalletLoadBalanceEnterAmountDataState.a(it10, false, false, null, null, null, 0L, null, null, null, null, null, null, 0, false, 32255);
            case 22:
                WalletLoadBalanceEnterAmountDataState it11 = (WalletLoadBalanceEnterAmountDataState) obj;
                Intrinsics.i(it11, "it");
                return WalletLoadBalanceEnterAmountDataState.a(it11, true, false, null, null, null, 0L, null, null, null, null, null, null, 0, false, 32766);
            case 23:
                WalletLoadBalanceEnterAmountDataState it12 = (WalletLoadBalanceEnterAmountDataState) obj;
                Intrinsics.i(it12, "it");
                return WalletLoadBalanceEnterAmountDataState.a(it12, true, false, null, null, null, 0L, null, null, null, null, null, null, 0, false, 31742);
            case 24:
                WalletLoadBalanceEnterAmountDataState it13 = (WalletLoadBalanceEnterAmountDataState) obj;
                Intrinsics.i(it13, "it");
                return WalletLoadBalanceEnterAmountDataState.a(it13, false, false, null, null, null, 0L, null, null, null, null, null, null, 0, false, 32255);
            case 25:
                return WalletLoadBalanceEnterAmountDataState.a((WalletLoadBalanceEnterAmountDataState) obj, false, false, null, null, null, 0L, null, null, null, null, null, null, 0, false, 32766);
            case 26:
                return WalletLoadBalanceEnterAmountDataState.a((WalletLoadBalanceEnterAmountDataState) obj, false, false, null, null, null, 0L, null, null, null, null, null, null, 0, false, 32766);
            case 27:
                return WalletLoadBalanceEnterAmountDataState.a((WalletLoadBalanceEnterAmountDataState) obj, false, false, null, null, null, 0L, null, null, null, null, null, null, 0, false, 32766);
            case 28:
                return WalletLoadBalanceEnterAmountDataState.a((WalletLoadBalanceEnterAmountDataState) obj, false, false, null, null, null, 0L, null, null, null, "Wallet sync failed", null, null, 0, false, 31743);
            default:
                SuggestAmountsDenominations it14 = (SuggestAmountsDenominations) obj;
                Intrinsics.i(it14, "it");
                return Integer.valueOf(it14.f10826a);
        }
    }
}
