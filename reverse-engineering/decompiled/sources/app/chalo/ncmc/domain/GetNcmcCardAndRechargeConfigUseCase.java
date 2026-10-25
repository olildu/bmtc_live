package app.chalo.ncmc.domain;

import app.chalo.ncmc.data.NcmcCardAppModel;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/GetNcmcCardAndRechargeConfigUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetNcmcCardAndRechargeConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetNcmcCardUseCase f6239a;
    public final GetNcmcCardRechargeConfigUseCase b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6240a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[NcmcConfigFailureReason.values().length];
            try {
                iArr[NcmcConfigFailureReason.NO_VALID_CONFIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NcmcConfigFailureReason.SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NcmcConfigFailureReason.UNKNOWN_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6240a = iArr;
            int[] iArr2 = new int[GetNcmcCardFailureReason.values().length];
            try {
                iArr2[GetNcmcCardFailureReason.USER_NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GetNcmcCardFailureReason.NO_USER_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GetNcmcCardFailureReason.NO_CARD_EXIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GetNcmcCardFailureReason.UNKNOWN_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    public GetNcmcCardAndRechargeConfigUseCase(GetNcmcCardUseCase getNcmcCardUseCase, GetNcmcCardRechargeConfigUseCase getNcmcCardRechargeConfigUseCase) {
        this.f6239a = getNcmcCardUseCase;
        this.b = getNcmcCardRechargeConfigUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        GetNcmcCardAndRechargeConfigUseCase$invoke$1 getNcmcCardAndRechargeConfigUseCase$invoke$1;
        ChaloUseCaseResult chaloUseCaseResult;
        GetNcmcCardAndRechargeConfigFailureReason getNcmcCardAndRechargeConfigFailureReason;
        ChaloUseCaseResult chaloUseCaseResult2;
        int i;
        GetNcmcCardAndRechargeConfigFailureReason getNcmcCardAndRechargeConfigFailureReason2;
        if (continuationImpl instanceof GetNcmcCardAndRechargeConfigUseCase$invoke$1) {
            getNcmcCardAndRechargeConfigUseCase$invoke$1 = (GetNcmcCardAndRechargeConfigUseCase$invoke$1) continuationImpl;
            int i2 = getNcmcCardAndRechargeConfigUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getNcmcCardAndRechargeConfigUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getNcmcCardAndRechargeConfigUseCase$invoke$1 = new GetNcmcCardAndRechargeConfigUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getNcmcCardAndRechargeConfigUseCase$invoke$1 = new GetNcmcCardAndRechargeConfigUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getNcmcCardAndRechargeConfigUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = getNcmcCardAndRechargeConfigUseCase$invoke$1.label;
        if (i3 == 0) {
            ResultKt.b(objA);
            getNcmcCardAndRechargeConfigUseCase$invoke$1.L$0 = str;
            getNcmcCardAndRechargeConfigUseCase$invoke$1.label = 1;
            objA = this.b.a(getNcmcCardAndRechargeConfigUseCase$invoke$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            str = (String) getNcmcCardAndRechargeConfigUseCase$invoke$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloUseCaseResult = (ChaloUseCaseResult) getNcmcCardAndRechargeConfigUseCase$invoke$1.L$0;
            ResultKt.b(objA);
        }
        chaloUseCaseResult2 = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult2 instanceof ChaloUseCaseResult.Failure) {
            return ((chaloUseCaseResult2 instanceof ChaloUseCaseResult.Success) || !(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) ? new ChaloUseCaseResult.Failure(GetNcmcCardAndRechargeConfigFailureReason.UNKNOWN_ERROR) : new ChaloUseCaseResult.Success(new NcmcCardAndRechargeConfigResult((NcmcCardAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult2).f10419a, (NcmcCardRechargeConfigAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a));
        }
        i = WhenMappings.b[((GetNcmcCardFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult2).f10418a).ordinal()];
        if (i != 1) {
            getNcmcCardAndRechargeConfigFailureReason2 = GetNcmcCardAndRechargeConfigFailureReason.USER_NOT_LOGGED_IN;
        } else if (i != 2) {
            getNcmcCardAndRechargeConfigFailureReason2 = GetNcmcCardAndRechargeConfigFailureReason.NO_USER_FOUND;
        } else if (i != 3) {
            getNcmcCardAndRechargeConfigFailureReason2 = GetNcmcCardAndRechargeConfigFailureReason.NO_CARD_EXIST;
        } else {
            if (i == 4) {
                throw new NoWhenBranchMatchedException();
            }
            getNcmcCardAndRechargeConfigFailureReason2 = GetNcmcCardAndRechargeConfigFailureReason.UNKNOWN_ERROR;
        }
        return new ChaloUseCaseResult.Failure(getNcmcCardAndRechargeConfigFailureReason2);
        ChaloUseCaseResult chaloUseCaseResult3 = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult3 instanceof ChaloUseCaseResult.Failure) {
            int i4 = WhenMappings.f6240a[((NcmcConfigFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult3).f10418a).ordinal()];
            if (i4 == 1) {
                getNcmcCardAndRechargeConfigFailureReason = GetNcmcCardAndRechargeConfigFailureReason.NO_VALID_CONFIG;
            } else if (i4 == 2) {
                getNcmcCardAndRechargeConfigFailureReason = GetNcmcCardAndRechargeConfigFailureReason.SERVER_ERROR;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                getNcmcCardAndRechargeConfigFailureReason = GetNcmcCardAndRechargeConfigFailureReason.UNKNOWN_ERROR;
            }
            return new ChaloUseCaseResult.Failure(getNcmcCardAndRechargeConfigFailureReason);
        }
        getNcmcCardAndRechargeConfigUseCase$invoke$1.L$0 = chaloUseCaseResult3;
        getNcmcCardAndRechargeConfigUseCase$invoke$1.label = 2;
        Object objB = this.f6239a.b(str, getNcmcCardAndRechargeConfigUseCase$invoke$1);
        if (objB != coroutineSingletons) {
            objA = objB;
            chaloUseCaseResult = chaloUseCaseResult3;
            chaloUseCaseResult2 = (ChaloUseCaseResult) objA;
            if (chaloUseCaseResult2 instanceof ChaloUseCaseResult.Failure) {
                if (chaloUseCaseResult2 instanceof ChaloUseCaseResult.Success) {
                }
            }
            i = WhenMappings.b[((GetNcmcCardFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult2).f10418a).ordinal()];
            if (i != 1) {
                getNcmcCardAndRechargeConfigFailureReason2 = GetNcmcCardAndRechargeConfigFailureReason.USER_NOT_LOGGED_IN;
            } else if (i != 2) {
                getNcmcCardAndRechargeConfigFailureReason2 = GetNcmcCardAndRechargeConfigFailureReason.NO_USER_FOUND;
            } else if (i != 3) {
                getNcmcCardAndRechargeConfigFailureReason2 = GetNcmcCardAndRechargeConfigFailureReason.NO_CARD_EXIST;
            } else {
                if (i == 4) {
                    throw new NoWhenBranchMatchedException();
                }
                getNcmcCardAndRechargeConfigFailureReason2 = GetNcmcCardAndRechargeConfigFailureReason.UNKNOWN_ERROR;
            }
            return new ChaloUseCaseResult.Failure(getNcmcCardAndRechargeConfigFailureReason2);
        }
        return coroutineSingletons;
    }
}
