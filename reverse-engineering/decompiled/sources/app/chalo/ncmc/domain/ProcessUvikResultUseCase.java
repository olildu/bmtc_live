package app.chalo.ncmc.domain;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.ncmc.uvik.UvikResult;
import app.chalo.ncmc.uvik.UvikTransactionStatus;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/ProcessUvikResultUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessUvikResultUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f6248a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6249a;

        static {
            int[] iArr = new int[UvikTransactionStatus.values().length];
            try {
                iArr[UvikTransactionStatus.Approved.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UvikTransactionStatus.Terminated.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UvikTransactionStatus.Declined.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UvikTransactionStatus.Failed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UvikTransactionStatus.SelectNext.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UvikTransactionStatus.Unknown.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f6249a = iArr;
        }
    }

    public ProcessUvikResultUseCase(AnalyticsContract analyticsContract) {
        this.f6248a = analyticsContract;
    }

    public final ChaloUseCaseResult a(UvikResult result) {
        Intrinsics.i(result, "result");
        boolean z = result instanceof UvikResult.Failure.Result;
        AnalyticsContract analyticsContract = this.f6248a;
        if (z) {
            Source source = Source.NCMC_TAP_SCREEN;
            UvikResult.Failure.Result result2 = (UvikResult.Failure.Result) result;
            String str = result2.c;
            String str2 = result2.f6444a;
            AnalyticsContractImplKt.b(analyticsContract, "ncmc tap operation failure", source, MapsKt.i(new Pair("errorCode", String.valueOf(str2)), new Pair("reason", String.valueOf(str))), false, 24);
            if (str2 == null) {
                str2 = "Unknown";
            }
            return new ChaloUseCaseResult.Failure(new UvikResultError.TapOperationFailure(str2, str));
        }
        if (result instanceof UvikResult.Failure.ResultUnavailable) {
            AnalyticsContractImplKt.b(analyticsContract, "ncmc tap operation result unavailable", Source.NCMC_TAP_SCREEN, vo1.s("reason", String.valueOf(((UvikResult.Failure.ResultUnavailable) result).b)), false, 24);
            return new ChaloUseCaseResult.Failure(UvikResultError.ResultUnavailable.f6252a);
        }
        if (!(result instanceof UvikResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        Source source2 = Source.NCMC_TAP_SCREEN;
        UvikResult.Success success = (UvikResult.Success) result;
        UvikTransactionStatus uvikTransactionStatus = success.f6445a;
        AnalyticsContractImplKt.b(analyticsContract, "ncmc tap operation success", source2, MapsKt.i(new Pair("transactionId", String.valueOf(success.d)), new Pair("rrn", String.valueOf(success.e)), new Pair("offlineBalance", String.valueOf(success.f)), new Pair("topUpAmount", String.valueOf(success.g)), new Pair("status", uvikTransactionStatus.toString()), new Pair("resultCode", String.valueOf(success.b)), new Pair("message", String.valueOf(success.c))), false, 24);
        switch (WhenMappings.f6249a[uvikTransactionStatus.ordinal()]) {
            case 1:
                return new ChaloUseCaseResult.Success(success);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AnalyticsContractImplKt.b(analyticsContract, "ncmc tap transaction failed", source2, vo1.s("status", uvikTransactionStatus.toString()), false, 24);
                return new ChaloUseCaseResult.Failure(new UvikResultError.TransactionFailure(uvikTransactionStatus.toString()));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
