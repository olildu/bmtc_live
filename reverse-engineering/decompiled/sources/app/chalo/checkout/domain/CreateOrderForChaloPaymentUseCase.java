package app.chalo.checkout.domain;

import app.chalo.checkout.data.exceptions.ChaloPaymentOrderCreationFailedException;
import app.chalo.checkout.data.model.app.ChaloPayOrderResponseAppModel;
import app.chalo.checkout.data.model.app.request.ChaloPayOrderRequestAppModel;
import app.chalo.checkout.data.repository.ICheckoutRepository;
import app.chalo.mvibase.simple.DataFetchOperationException;
import app.chalo.mvibase.simple.OperationFailureError;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.mvibase.simple.UseCaseOperationErrorKt;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolverError;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/CreateOrderForChaloPaymentUseCase;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateOrderForChaloPaymentUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f1369a;
    public final ICheckoutRepository b;
    public final StringProvider c;
    public final WalletResolver d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1370a;

        static {
            int[] iArr = new int[WalletResolverError.values().length];
            try {
                iArr[WalletResolverError.WALLET_NOT_CACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletResolverError.NOT_LOGGED_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1370a = iArr;
        }
    }

    public CreateOrderForChaloPaymentUseCase(CityProvider cityProvider, ICheckoutRepository iCheckoutRepository, StringProvider stringProvider, WalletResolver walletResolver) {
        this.f1369a = cityProvider;
        this.b = iCheckoutRepository;
        this.c = stringProvider;
        this.d = walletResolver;
    }

    public static ChaloUseCaseResult.Failure a(ChaloPaymentOrderCreationFailureReason chaloPaymentOrderCreationFailureReason, String str) {
        return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(chaloPaymentOrderCreationFailureReason), chaloPaymentOrderCreationFailureReason.getErrorCode(), str));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00bf A[Catch: Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:18:0x004d, B:47:0x00d4, B:21:0x0055, B:41:0x00bb, B:43:0x00bf, B:49:0x00de, B:24:0x005f, B:30:0x0074, B:32:0x007a, B:34:0x0090, B:36:0x0094, B:38:0x00a2, B:51:0x00e4, B:53:0x00e8, B:55:0x00ed, B:56:0x00f2, B:27:0x0066), top: B:86:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00de A[Catch: Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:18:0x004d, B:47:0x00d4, B:21:0x0055, B:41:0x00bb, B:43:0x00bf, B:49:0x00de, B:24:0x005f, B:30:0x0074, B:32:0x007a, B:34:0x0090, B:36:0x0094, B:38:0x00a2, B:51:0x00e4, B:53:0x00e8, B:55:0x00ed, B:56:0x00f2, B:27:0x0066), top: B:86:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i, String str, WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        CreateOrderForChaloPaymentUseCase$invoke$1 createOrderForChaloPaymentUseCase$invoke$1;
        ChaloPaymentOrderCreationFailureReason chaloPaymentOrderCreationFailureReason;
        CreateOrderForChaloPaymentUseCase createOrderForChaloPaymentUseCase;
        ChaloPaymentOrderCreationFailureReason next;
        String lowerCase;
        String str2;
        ChaloPayOrderResponseAppModel chaloPayOrderResponseAppModel;
        ChaloPaymentOrderCreationFailureReason chaloPaymentOrderCreationFailureReason2;
        CreateOrderForChaloPaymentUseCase createOrderForChaloPaymentUseCase2;
        if (continuationImpl instanceof CreateOrderForChaloPaymentUseCase$invoke$1) {
            createOrderForChaloPaymentUseCase$invoke$1 = (CreateOrderForChaloPaymentUseCase$invoke$1) continuationImpl;
            int i2 = createOrderForChaloPaymentUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                createOrderForChaloPaymentUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                createOrderForChaloPaymentUseCase$invoke$1 = new CreateOrderForChaloPaymentUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            createOrderForChaloPaymentUseCase$invoke$1 = new CreateOrderForChaloPaymentUseCase$invoke$1(this, continuationImpl);
        }
        Object objB = createOrderForChaloPaymentUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = createOrderForChaloPaymentUseCase$invoke$1.label;
        StringProvider stringProvider = this.c;
        try {
            if (i3 == 0) {
                ResultKt.b(objB);
                createOrderForChaloPaymentUseCase$invoke$1.L$0 = str;
                createOrderForChaloPaymentUseCase$invoke$1.I$0 = i;
                createOrderForChaloPaymentUseCase$invoke$1.label = 1;
                objB = c(walletTypeIdentifier, createOrderForChaloPaymentUseCase$invoke$1);
                if (objB == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 == 1) {
                i = createOrderForChaloPaymentUseCase$invoke$1.I$0;
                str = (String) createOrderForChaloPaymentUseCase$invoke$1.L$0;
                ResultKt.b(objB);
            } else if (i3 == 2) {
                ResultKt.b(objB);
                chaloPayOrderResponseAppModel = (ChaloPayOrderResponseAppModel) objB;
                if (chaloPayOrderResponseAppModel == null) {
                    return new ChaloUseCaseResult.Success(chaloPayOrderResponseAppModel);
                }
                chaloPaymentOrderCreationFailureReason2 = ChaloPaymentOrderCreationFailureReason.UNKNOWN_ERROR;
                createOrderForChaloPaymentUseCase$invoke$1.L$0 = this;
                createOrderForChaloPaymentUseCase$invoke$1.L$1 = chaloPaymentOrderCreationFailureReason2;
                createOrderForChaloPaymentUseCase$invoke$1.label = 3;
                objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], createOrderForChaloPaymentUseCase$invoke$1);
                if (objB != coroutineSingletons) {
                    return coroutineSingletons;
                }
                createOrderForChaloPaymentUseCase2 = this;
            } else {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    chaloPaymentOrderCreationFailureReason = (ChaloPaymentOrderCreationFailureReason) createOrderForChaloPaymentUseCase$invoke$1.L$1;
                    createOrderForChaloPaymentUseCase = (CreateOrderForChaloPaymentUseCase) createOrderForChaloPaymentUseCase$invoke$1.L$0;
                    ResultKt.b(objB);
                    createOrderForChaloPaymentUseCase.getClass();
                    return a(chaloPaymentOrderCreationFailureReason, (String) objB);
                }
                chaloPaymentOrderCreationFailureReason2 = (ChaloPaymentOrderCreationFailureReason) createOrderForChaloPaymentUseCase$invoke$1.L$1;
                createOrderForChaloPaymentUseCase2 = (CreateOrderForChaloPaymentUseCase) createOrderForChaloPaymentUseCase$invoke$1.L$0;
                ResultKt.b(objB);
            }
            createOrderForChaloPaymentUseCase2.getClass();
            return a(chaloPaymentOrderCreationFailureReason2, (String) objB);
            ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objB;
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                    return ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                }
                throw new NoWhenBranchMatchedException();
            }
            WalletAppModel walletAppModel = (WalletAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            CityAppModel cityAppModel = (CityAppModel) this.f1369a.b().getValue();
            if (cityAppModel == null || (str2 = cityAppModel.f8854a) == null) {
                lowerCase = null;
            } else {
                lowerCase = str2.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
            }
            ChaloPayOrderRequestAppModel chaloPayOrderRequestAppModel = new ChaloPayOrderRequestAppModel(str, i, String.valueOf(lowerCase), walletAppModel.getF11008a());
            ICheckoutRepository iCheckoutRepository = this.b;
            createOrderForChaloPaymentUseCase$invoke$1.L$0 = null;
            createOrderForChaloPaymentUseCase$invoke$1.label = 2;
            objB = iCheckoutRepository.f(chaloPayOrderRequestAppModel, createOrderForChaloPaymentUseCase$invoke$1);
            if (objB != coroutineSingletons) {
                chaloPayOrderResponseAppModel = (ChaloPayOrderResponseAppModel) objB;
                if (chaloPayOrderResponseAppModel == null) {
                    return new ChaloUseCaseResult.Success(chaloPayOrderResponseAppModel);
                }
                chaloPaymentOrderCreationFailureReason2 = ChaloPaymentOrderCreationFailureReason.UNKNOWN_ERROR;
                createOrderForChaloPaymentUseCase$invoke$1.L$0 = this;
                createOrderForChaloPaymentUseCase$invoke$1.L$1 = chaloPaymentOrderCreationFailureReason2;
                createOrderForChaloPaymentUseCase$invoke$1.label = 3;
                objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], createOrderForChaloPaymentUseCase$invoke$1);
                if (objB != coroutineSingletons) {
                    createOrderForChaloPaymentUseCase2 = this;
                    createOrderForChaloPaymentUseCase2.getClass();
                    return a(chaloPaymentOrderCreationFailureReason2, (String) objB);
                }
            }
            return coroutineSingletons;
        } catch (Exception e) {
            if (!(e instanceof ChaloPaymentOrderCreationFailedException)) {
                if (e instanceof DataFetchOperationException) {
                    return new ChaloUseCaseResult.Failure(UseCaseOperationErrorKt.a((DataFetchOperationException) e));
                }
                chaloPaymentOrderCreationFailureReason = ChaloPaymentOrderCreationFailureReason.UNKNOWN_ERROR;
                createOrderForChaloPaymentUseCase$invoke$1.L$0 = this;
                createOrderForChaloPaymentUseCase$invoke$1.L$1 = chaloPaymentOrderCreationFailureReason;
                createOrderForChaloPaymentUseCase$invoke$1.label = 4;
                objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], createOrderForChaloPaymentUseCase$invoke$1);
                if (objB != coroutineSingletons) {
                    createOrderForChaloPaymentUseCase = this;
                }
                return coroutineSingletons;
            }
            ChaloPaymentOrderCreationFailedException chaloPaymentOrderCreationFailedException = (ChaloPaymentOrderCreationFailedException) e;
            GenericChaloErrorResponse genericChaloErrorResponse = chaloPaymentOrderCreationFailedException.getGenericChaloErrorResponse();
            int errorCode = genericChaloErrorResponse != null ? genericChaloErrorResponse.f6497a : ChaloPaymentOrderCreationFailureReason.UNKNOWN_ERROR.getErrorCode();
            Iterator<ChaloPaymentOrderCreationFailureReason> it = ChaloPaymentOrderCreationFailureReason.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.getErrorCode() != errorCode);
            ChaloPaymentOrderCreationFailureReason chaloPaymentOrderCreationFailureReason3 = next;
            if (chaloPaymentOrderCreationFailureReason3 == null) {
                chaloPaymentOrderCreationFailureReason3 = ChaloPaymentOrderCreationFailureReason.UNKNOWN_ERROR;
            }
            GenericChaloErrorResponse genericChaloErrorResponse2 = chaloPaymentOrderCreationFailedException.getGenericChaloErrorResponse();
            return a(chaloPaymentOrderCreationFailureReason3, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        CreateOrderForChaloPaymentUseCase$resolveWallet$1 createOrderForChaloPaymentUseCase$resolveWallet$1;
        ChaloPaymentOrderCreationFailureReason chaloPaymentOrderCreationFailureReason;
        CreateOrderForChaloPaymentUseCase createOrderForChaloPaymentUseCase;
        ChaloPaymentOrderCreationFailureReason chaloPaymentOrderCreationFailureReason2;
        CreateOrderForChaloPaymentUseCase createOrderForChaloPaymentUseCase2;
        ChaloUseCaseResult.Failure failureA;
        if (continuationImpl instanceof CreateOrderForChaloPaymentUseCase$resolveWallet$1) {
            createOrderForChaloPaymentUseCase$resolveWallet$1 = (CreateOrderForChaloPaymentUseCase$resolveWallet$1) continuationImpl;
            int i = createOrderForChaloPaymentUseCase$resolveWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createOrderForChaloPaymentUseCase$resolveWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                createOrderForChaloPaymentUseCase$resolveWallet$1 = new CreateOrderForChaloPaymentUseCase$resolveWallet$1(this, continuationImpl);
            }
        } else {
            createOrderForChaloPaymentUseCase$resolveWallet$1 = new CreateOrderForChaloPaymentUseCase$resolveWallet$1(this, continuationImpl);
        }
        Object objE = createOrderForChaloPaymentUseCase$resolveWallet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = createOrderForChaloPaymentUseCase$resolveWallet$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            createOrderForChaloPaymentUseCase$resolveWallet$1.label = 1;
            objE = this.d.e(walletTypeIdentifier, createOrderForChaloPaymentUseCase$resolveWallet$1);
            if (objE != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                chaloPaymentOrderCreationFailureReason = (ChaloPaymentOrderCreationFailureReason) createOrderForChaloPaymentUseCase$resolveWallet$1.L$1;
                createOrderForChaloPaymentUseCase = (CreateOrderForChaloPaymentUseCase) createOrderForChaloPaymentUseCase$resolveWallet$1.L$0;
                ResultKt.b(objE);
                createOrderForChaloPaymentUseCase.getClass();
                failureA = a(chaloPaymentOrderCreationFailureReason, (String) objE);
                return new ChaloUseCaseResult.Failure(failureA);
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloPaymentOrderCreationFailureReason2 = (ChaloPaymentOrderCreationFailureReason) createOrderForChaloPaymentUseCase$resolveWallet$1.L$1;
            createOrderForChaloPaymentUseCase2 = (CreateOrderForChaloPaymentUseCase) createOrderForChaloPaymentUseCase$resolveWallet$1.L$0;
            ResultKt.b(objE);
            createOrderForChaloPaymentUseCase2.getClass();
            failureA = a(chaloPaymentOrderCreationFailureReason2, (String) objE);
            return new ChaloUseCaseResult.Failure(failureA);
        }
        ResultKt.b(objE);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objE;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return new ChaloUseCaseResult.Success(((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.f1370a[((WalletResolverError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()];
        StringProvider stringProvider = this.c;
        if (i3 == 1) {
            chaloPaymentOrderCreationFailureReason = ChaloPaymentOrderCreationFailureReason.CACHED_WALLET_FETCH_FAILED;
            createOrderForChaloPaymentUseCase$resolveWallet$1.L$0 = this;
            createOrderForChaloPaymentUseCase$resolveWallet$1.L$1 = chaloPaymentOrderCreationFailureReason;
            createOrderForChaloPaymentUseCase$resolveWallet$1.label = 2;
            objE = stringProvider.b(StringEnum.CACHED_WALLET_FETCH_FAILED, new Object[0], createOrderForChaloPaymentUseCase$resolveWallet$1);
            if (objE != coroutineSingletons) {
                createOrderForChaloPaymentUseCase = this;
                createOrderForChaloPaymentUseCase.getClass();
                failureA = a(chaloPaymentOrderCreationFailureReason, (String) objE);
                return new ChaloUseCaseResult.Failure(failureA);
            }
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            chaloPaymentOrderCreationFailureReason2 = ChaloPaymentOrderCreationFailureReason.UNAUTHORIZED;
            createOrderForChaloPaymentUseCase$resolveWallet$1.L$0 = this;
            createOrderForChaloPaymentUseCase$resolveWallet$1.L$1 = chaloPaymentOrderCreationFailureReason2;
            createOrderForChaloPaymentUseCase$resolveWallet$1.label = 3;
            objE = stringProvider.b(StringEnum.USER_NOT_LOGGED_IN, new Object[0], createOrderForChaloPaymentUseCase$resolveWallet$1);
            if (objE != coroutineSingletons) {
                createOrderForChaloPaymentUseCase2 = this;
                createOrderForChaloPaymentUseCase2.getClass();
                failureA = a(chaloPaymentOrderCreationFailureReason2, (String) objE);
                return new ChaloUseCaseResult.Failure(failureA);
            }
        }
        return coroutineSingletons;
    }
}
