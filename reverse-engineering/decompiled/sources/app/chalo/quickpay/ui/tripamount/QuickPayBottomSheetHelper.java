package app.chalo.quickpay.ui.tripamount;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayBottomSheetError;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountScreenBottomSheetType;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.wallet.domain.CreateQuickPayOrderUsecase;
import app.chalo.wallet.domain.QuickPayValidationResult;
import app.chalo.wallet.domain.ValidateQuickPayUseCase;
import app.chalo.wallet.domain.ValidateQuickPayUseCaseKt;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/ui/tripamount/QuickPayBottomSheetHelper;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickPayBottomSheetHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreateQuickPayOrderUsecase f8893a;
    public final AnalyticsContract b;
    public final ValidateQuickPayUseCase c;
    public final MutableStateFlow d;
    public final StateFlow e;

    public QuickPayBottomSheetHelper(CreateQuickPayOrderUsecase createQuickPayOrderUsecase, AnalyticsContract analyticsContract, ValidateQuickPayUseCase validateQuickPayUseCase) {
        this.f8893a = createQuickPayOrderUsecase;
        this.b = analyticsContract;
        this.c = validateQuickPayUseCase;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        this.d = mutableStateFlowA;
        this.e = mutableStateFlowA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, WalletAppModel walletAppModel, Function1 function1, ContinuationImpl continuationImpl) {
        QuickPayBottomSheetHelper$createQuickpayOrder$1 quickPayBottomSheetHelper$createQuickpayOrder$1;
        MutableStateFlow mutableStateFlow;
        Object value;
        Object objA;
        QuickpayBottomSheetError quickpayBottomSheetError;
        if (continuationImpl instanceof QuickPayBottomSheetHelper$createQuickpayOrder$1) {
            quickPayBottomSheetHelper$createQuickpayOrder$1 = (QuickPayBottomSheetHelper$createQuickpayOrder$1) continuationImpl;
            int i = quickPayBottomSheetHelper$createQuickpayOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayBottomSheetHelper$createQuickpayOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayBottomSheetHelper$createQuickpayOrder$1 = new QuickPayBottomSheetHelper$createQuickpayOrder$1(this, continuationImpl);
            }
        } else {
            quickPayBottomSheetHelper$createQuickpayOrder$1 = new QuickPayBottomSheetHelper$createQuickpayOrder$1(this, continuationImpl);
        }
        Object objA2 = quickPayBottomSheetHelper$createQuickpayOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayBottomSheetHelper$createQuickpayOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objA2);
            quickPayBottomSheetHelper$createQuickpayOrder$1.L$0 = walletAppModel;
            quickPayBottomSheetHelper$createQuickpayOrder$1.L$1 = function1;
            quickPayBottomSheetHelper$createQuickpayOrder$1.J$0 = j;
            quickPayBottomSheetHelper$createQuickpayOrder$1.label = 1;
            objA2 = this.f8893a.a(walletAppModel, j, quickPayBottomSheetHelper$createQuickpayOrder$1);
            if (objA2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = quickPayBottomSheetHelper$createQuickpayOrder$1.J$0;
            function1 = (Function1) quickPayBottomSheetHelper$createQuickpayOrder$1.L$1;
            walletAppModel = (WalletAppModel) quickPayBottomSheetHelper$createQuickpayOrder$1.L$0;
            ResultKt.b(objA2);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA2;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            do {
                mutableStateFlow = this.d;
                value = mutableStateFlow.getValue();
                objA = (QuickpayTripAmountScreenBottomSheetType) value;
                if (objA instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                    QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet quickPayConfirmationBottomSheet = (QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) objA;
                    QuickpayBottomSheetError.Companion companion = QuickpayBottomSheetError.INSTANCE;
                    int iIntValue = ((Number) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).intValue();
                    companion.getClass();
                    switch (iIntValue) {
                        case 99:
                            quickpayBottomSheetError = QuickpayBottomSheetError.USER_NOT_FOUND;
                            break;
                        case 100:
                            quickpayBottomSheetError = QuickpayBottomSheetError.WALLET_NOT_FOUND;
                            break;
                        case 101:
                            quickpayBottomSheetError = QuickpayBottomSheetError.BALANCE_NOT_SUFFICIENT;
                            break;
                        default:
                            quickpayBottomSheetError = QuickpayBottomSheetError.SOMETHING_WENT_WRONG;
                            break;
                    }
                    objA = QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet.a(quickPayConfirmationBottomSheet, false, 0L, quickpayBottomSheetError, 23);
                }
            } while (!mutableStateFlow.c(value, objA));
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticsContractImplKt.b(this.b, "chalo pay bottom sheet fragment next button clicked", Source.QUICK_PAY_BOTTOM_SHEET, MapsKt.k(new Pair("chalo pay bottom sheet amount", String.valueOf(new Long(j))), new Pair("chalo pay bottom sheet wallet balance left", Integer.valueOf(walletAppModel.getD()))), false, 24);
            function1.invoke(((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0199  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
    
        if (a(r10, r3, r12, r5) == r6) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r23, defpackage.g01 r24, defpackage.g01 r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.quickpay.ui.tripamount.QuickPayBottomSheetHelper.b(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier, g01, g01, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object c(long j, WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        QuickPayBottomSheetHelper$showQuickpayConfirmationBottomSheet$1 quickPayBottomSheetHelper$showQuickpayConfirmationBottomSheet$1;
        Object value;
        Object value2;
        Object objA;
        Object value3;
        Object objA2;
        Object value4;
        Object objA3;
        Object value5;
        Object objA4;
        if (continuationImpl instanceof QuickPayBottomSheetHelper$showQuickpayConfirmationBottomSheet$1) {
            quickPayBottomSheetHelper$showQuickpayConfirmationBottomSheet$1 = (QuickPayBottomSheetHelper$showQuickpayConfirmationBottomSheet$1) continuationImpl;
            int i = quickPayBottomSheetHelper$showQuickpayConfirmationBottomSheet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayBottomSheetHelper$showQuickpayConfirmationBottomSheet$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayBottomSheetHelper$showQuickpayConfirmationBottomSheet$1 = new QuickPayBottomSheetHelper$showQuickpayConfirmationBottomSheet$1(this, continuationImpl);
            }
        } else {
            quickPayBottomSheetHelper$showQuickpayConfirmationBottomSheet$1 = new QuickPayBottomSheetHelper$showQuickpayConfirmationBottomSheet$1(this, continuationImpl);
        }
        Object objA5 = quickPayBottomSheetHelper$showQuickpayConfirmationBottomSheet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayBottomSheetHelper$showQuickpayConfirmationBottomSheet$1.label;
        MutableStateFlow mutableStateFlow = this.d;
        if (i2 == 0) {
            ResultKt.b(objA5);
            AnalyticsContractImplKt.b(this.b, "chalo pay bottom sheet fragment opened", Source.QUICK_PAY_TRIP_AMOUNT_SCREEN, null, false, 28);
            QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet quickPayConfirmationBottomSheet = new QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet(j, true, 0L, null, walletTypeIdentifier.c);
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value, quickPayConfirmationBottomSheet));
            quickPayBottomSheetHelper$showQuickpayConfirmationBottomSheet$1.label = 1;
            objA5 = this.c.a(j, walletTypeIdentifier, quickPayBottomSheetHelper$showQuickpayConfirmationBottomSheet$1);
            if (objA5 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA5);
        }
        QuickPayValidationResult quickPayValidationResult = (QuickPayValidationResult) objA5;
        if (quickPayValidationResult instanceof QuickPayValidationResult.Success) {
            long j2 = ((QuickPayValidationResult.Success) quickPayValidationResult).b;
            do {
                value5 = mutableStateFlow.getValue();
                objA4 = (QuickpayTripAmountScreenBottomSheetType) value5;
                if (objA4 instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                    objA4 = QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet.a((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) objA4, false, j2, null, 27);
                }
            } while (!mutableStateFlow.c(value5, objA4));
        } else if (quickPayValidationResult instanceof QuickPayValidationResult.InsufficientBalance) {
            long j3 = ((QuickPayValidationResult.InsufficientBalance) quickPayValidationResult).f10779a;
            do {
                value3 = mutableStateFlow.getValue();
                objA2 = (QuickpayTripAmountScreenBottomSheetType) value3;
                if (objA2 instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                    objA2 = QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet.a((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) objA2, false, j3, QuickpayBottomSheetError.BALANCE_NOT_SUFFICIENT, 19);
                }
            } while (!mutableStateFlow.c(value3, objA2));
        } else {
            if (!Intrinsics.d(quickPayValidationResult, QuickPayValidationResult.GeneralError.f10778a) && !Intrinsics.d(quickPayValidationResult, QuickPayValidationResult.UserNotFound.f10781a) && !Intrinsics.d(quickPayValidationResult, QuickPayValidationResult.WalletNotFound.f10782a)) {
                throw new NoWhenBranchMatchedException();
            }
            QuickpayBottomSheetError quickpayBottomSheetErrorA = ValidateQuickPayUseCaseKt.a(quickPayValidationResult);
            if (quickpayBottomSheetErrorA != null) {
                do {
                    value2 = mutableStateFlow.getValue();
                    objA = (QuickpayTripAmountScreenBottomSheetType) value2;
                    if (objA instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                        objA = QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet.a((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) objA, false, 0L, quickpayBottomSheetErrorA, 23);
                    }
                } while (!mutableStateFlow.c(value2, objA));
            }
        }
        do {
            value4 = mutableStateFlow.getValue();
            objA3 = (QuickpayTripAmountScreenBottomSheetType) value4;
            if (objA3 instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) {
                objA3 = QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet.a((QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) objA3, false, 0L, null, 29);
            }
        } while (!mutableStateFlow.c(value4, objA3));
        return Unit.f17538a;
    }
}
