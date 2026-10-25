package app.chalo.home.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.features.productsync.constants.SuperPassApplicationStatus;
import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.instantticket.data.model.InstantTicketStatus;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStatus;
import app.chalo.ondc.model.app.OndcMetroTicketStatus;
import app.chalo.ondc.model.app.OndcTicketStatus;
import app.chalo.providers.stringprovider.StringProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/GetProductStatusUIUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetProductStatusUIUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f3044a;
    public final FetchHistoryScreenConfigDataUseCase b;
    public final BasicInfoContract c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3045a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;

        static {
            int[] iArr = new int[InstantTicketStatus.values().length];
            try {
                iArr[InstantTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstantTicketStatus.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InstantTicketStatus.PAYMENT_PROCESSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InstantTicketStatus.PAYMENT_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InstantTicketStatus.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InstantTicketStatus.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f3045a = iArr;
            int[] iArr2 = new int[MultiModalGroupTicketStatus.values().length];
            try {
                iArr2[MultiModalGroupTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MultiModalGroupTicketStatus.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MultiModalGroupTicketStatus.PUNCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MultiModalGroupTicketStatus.PAYMENT_PROCESSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[MultiModalGroupTicketStatus.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            b = iArr2;
            int[] iArr3 = new int[OndcMetroTicketStatus.values().length];
            try {
                iArr3[OndcMetroTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[OndcMetroTicketStatus.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[OndcMetroTicketStatus.USED.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[OndcMetroTicketStatus.PUNCHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[OndcMetroTicketStatus.CANCELLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[OndcMetroTicketStatus.CANCEL_INITIATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[OndcMetroTicketStatus.PAYMENT_PROCESSING.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[OndcMetroTicketStatus.PAYMENT_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[OndcMetroTicketStatus.FAILED.ordinal()] = 9;
            } catch (NoSuchFieldError unused20) {
            }
            c = iArr3;
            int[] iArr4 = new int[OndcTicketStatus.values().length];
            try {
                iArr4[OndcTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[OndcTicketStatus.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[OndcTicketStatus.USED.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[OndcTicketStatus.PUNCHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[OndcTicketStatus.PAYMENT_PROCESSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[OndcTicketStatus.PAYMENT_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[OndcTicketStatus.FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused27) {
            }
            d = iArr4;
            int[] iArr5 = new int[SuperPassStatus.values().length];
            try {
                iArr5[SuperPassStatus.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr5[SuperPassStatus.PAYMENT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr5[SuperPassStatus.PAYMENT_PROCESSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr5[SuperPassStatus.UNUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr5[SuperPassStatus.USED.ordinal()] = 5;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[SuperPassStatus.INACTIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr5[SuperPassStatus.EXPIRED.ordinal()] = 7;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[SuperPassStatus.CANCELLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused35) {
            }
            e = iArr5;
            int[] iArr6 = new int[SuperPassApplicationStatus.values().length];
            try {
                iArr6[SuperPassApplicationStatus.UNVERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr6[SuperPassApplicationStatus.VERIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr6[SuperPassApplicationStatus.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr6[SuperPassApplicationStatus.PAYMENT_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused39) {
            }
            f = iArr6;
        }
    }

    public GetProductStatusUIUseCase(StringProvider stringProvider, FetchHistoryScreenConfigDataUseCase fetchHistoryScreenConfigDataUseCase, BasicInfoContract basicInfoContract) {
        this.f3044a = stringProvider;
        this.b = fetchHistoryScreenConfigDataUseCase;
        this.c = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x046f  */
    /* JADX WARN: Code duplicated, block: B:119:0x047b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0489  */
    /* JADX WARN: Code duplicated, block: B:125:0x0494  */
    /* JADX WARN: Code duplicated, block: B:128:0x04ab A[PHI: r1 r2 r7 r9 r15
      0x04ab: PHI (r1v83 app.chalo.providers.iconassetprovider.IconType) = (r1v82 app.chalo.providers.iconassetprovider.IconType), (r1v87 app.chalo.providers.iconassetprovider.IconType) binds: [B:126:0x04a7, B:46:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x04ab: PHI (r2v67 java.lang.Object) = (r2v66 java.lang.Object), (r2v1 java.lang.Object) binds: [B:126:0x04a7, B:46:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x04ab: PHI (r7v20 int A[IMMUTABLE_TYPE]) = (r7v19 int), (r7v22 int) binds: [B:126:0x04a7, B:46:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x04ab: PHI (r9v1 app.chalo.uistate.base.ChaloColorToken) = (r9v0 app.chalo.uistate.base.ChaloColorToken), (r9v3 app.chalo.uistate.base.ChaloColorToken) binds: [B:126:0x04a7, B:46:0x01f6] A[DONT_GENERATE, DONT_INLINE]
      0x04ab: PHI (r15v14 app.chalo.providers.stringprovider.StringProvider) = (r15v12 app.chalo.providers.stringprovider.StringProvider), (r15v15 app.chalo.providers.stringprovider.StringProvider) binds: [B:126:0x04a7, B:46:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0505  */
    /* JADX WARN: Code duplicated, block: B:145:0x0512  */
    /* JADX WARN: Code duplicated, block: B:148:0x0522  */
    /* JADX WARN: Code duplicated, block: B:151:0x052d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0544 A[PHI: r1 r2 r7 r9 r15
      0x0544: PHI (r1v110 app.chalo.providers.iconassetprovider.IconType) = (r1v107 app.chalo.providers.iconassetprovider.IconType), (r1v114 app.chalo.providers.iconassetprovider.IconType) binds: [B:152:0x0540, B:41:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x0544: PHI (r2v89 java.lang.Object) = (r2v88 java.lang.Object), (r2v1 java.lang.Object) binds: [B:152:0x0540, B:41:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x0544: PHI (r7v26 int A[IMMUTABLE_TYPE]) = (r7v25 int), (r7v28 int) binds: [B:152:0x0540, B:41:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x0544: PHI (r9v4 app.chalo.uistate.base.ChaloColorToken) = (r9v0 app.chalo.uistate.base.ChaloColorToken), (r9v6 app.chalo.uistate.base.ChaloColorToken) binds: [B:152:0x0540, B:41:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x0544: PHI (r15v23 app.chalo.providers.stringprovider.StringProvider) = (r15v21 app.chalo.providers.stringprovider.StringProvider), (r15v24 app.chalo.providers.stringprovider.StringProvider) binds: [B:152:0x0540, B:41:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:157:0x055c  */
    /* JADX WARN: Code duplicated, block: B:160:0x0569 A[PHI: r1 r15
      0x0569: PHI (r1v97 app.chalo.home.domain.ChaloUserBookingType) = (r1v94 app.chalo.home.domain.ChaloUserBookingType), (r1v106 app.chalo.home.domain.ChaloUserBookingType) binds: [B:144:0x0510, B:150:0x052b] A[DONT_GENERATE, DONT_INLINE]
      0x0569: PHI (r15v20 app.chalo.providers.stringprovider.StringProvider) = (r15v18 app.chalo.providers.stringprovider.StringProvider), (r15v21 app.chalo.providers.stringprovider.StringProvider) binds: [B:144:0x0510, B:150:0x052b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x057c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0582  */
    /* JADX WARN: Code duplicated, block: B:175:0x05be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:182:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:191:0x062a  */
    /* JADX WARN: Code duplicated, block: B:212:0x069f  */
    /* JADX WARN: Code duplicated, block: B:223:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:232:0x071b  */
    /* JADX WARN: Code duplicated, block: B:241:0x0755  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0595, code lost:
    
        if (r2 == r4) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x064a, code lost:
    
        if (r2 == r4) goto L240;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 2034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.GetProductStatusUIUseCase.a(app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
