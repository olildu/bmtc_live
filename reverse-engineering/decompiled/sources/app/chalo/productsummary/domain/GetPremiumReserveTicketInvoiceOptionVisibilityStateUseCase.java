package app.chalo.productsummary.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/domain/GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f8717a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8718a;

        static {
            int[] iArr = new int[PremiumReserveTicketStatus.values().length];
            try {
                iArr[PremiumReserveTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumReserveTicketStatus.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumReserveTicketStatus.USED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PremiumReserveTicketStatus.PUNCHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PremiumReserveTicketStatus.PAYMENT_PROCESSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PremiumReserveTicketStatus.PAYMENT_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PremiumReserveTicketStatus.USER_CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PremiumReserveTicketStatus.SYSTEM_CANCELLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PremiumReserveTicketStatus.USER_RESCHEDULED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PremiumReserveTicketStatus.SYSTEM_RESCHEDULED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PremiumReserveTicketStatus.BOOKING_UNDER_PROCESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PremiumReserveTicketStatus.BOOKING_FAILED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PremiumReserveTicketStatus.FAILED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f8718a = iArr;
        }
    }

    public GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase(BasicInfoContract basicInfoContract) {
        this.f8717a = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(PremiumReserveTicketAppModel premiumReserveTicketAppModel, ContinuationImpl continuationImpl) {
        GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1 getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1;
        long j;
        long j2;
        if (continuationImpl instanceof GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1) {
            getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1 = (GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1) continuationImpl;
            int i = getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1 = new GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1 = new GetPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1(this, continuationImpl);
        }
        Object objC = getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                j = getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1.J$0;
                ResultKt.b(objC);
                return new DownloadInvoiceOptionVisibilityState(((Number) objC).longValue() >= j + 172800000, true);
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1.J$0;
            ResultKt.b(objC);
            return new DownloadInvoiceOptionVisibilityState(((Number) objC).longValue() >= j2 + 172800000, true);
        }
        ResultKt.b(objC);
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel.f7113a;
        long j3 = premiumReserveTicketAppModel.b.b;
        int i3 = WhenMappings.f8718a[premiumReserveTicketBookingPropertiesAppModel.h.ordinal()];
        BasicInfoContract basicInfoContract = this.f8717a;
        switch (i3) {
            case 1:
                return new DownloadInvoiceOptionVisibilityState(false, true);
            case 2:
                getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1.J$0 = j3;
                getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1.label = 1;
                objC = basicInfoContract.c(getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1);
                if (objC != coroutineSingletons) {
                    j = j3;
                    return new DownloadInvoiceOptionVisibilityState(((Number) objC).longValue() >= j + 172800000, true);
                }
                return coroutineSingletons;
            case 3:
            case 4:
                Long l = premiumReserveTicketAppModel.c.e;
                long jLongValue = l != null ? l.longValue() : j3;
                getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1.J$0 = jLongValue;
                getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1.label = 2;
                Object objC2 = basicInfoContract.c(getPremiumReserveTicketInvoiceOptionVisibilityStateUseCase$invoke$1);
                if (objC2 != coroutineSingletons) {
                    objC = objC2;
                    j2 = jLongValue;
                    return new DownloadInvoiceOptionVisibilityState(((Number) objC).longValue() >= j2 + 172800000, true);
                }
                return coroutineSingletons;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return new DownloadInvoiceOptionVisibilityState(false, false);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
