package app.chalo.juspay;

import app.chalo.analytics.contract.AnalyticsContract;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/juspay/ProcessJuspayResultObjectUseCase;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessJuspayResultObjectUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f4088a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/ProcessJuspayResultObjectUseCase$Companion;", "", "", "FALSE_STRING", "Ljava/lang/String;", "REQUEST_ID_KEY", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4089a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[JusPayResultEventType.values().length];
            try {
                iArr[JusPayResultEventType.ShowLoader.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JusPayResultEventType.HideLoader.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JusPayResultEventType.Initiate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JusPayResultEventType.Process.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JusPayResultEventType.LogStream.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[JusPayResultEventType.Unknown.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[JusPayResultEventType.SessionExpired.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f4089a = iArr;
            int[] iArr2 = new int[JusPayAction.values().length];
            try {
                iArr2[JusPayAction.Initiate.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[JusPayAction.GetUpiSessionToken.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[JusPayAction.OnBoardingAndPay.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[JusPayAction.Management.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[JusPayAction.UpiUiScanPay.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[JusPayAction.UpdateAuth.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[JusPayAction.Unknown.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            b = iArr2;
        }
    }

    public ProcessJuspayResultObjectUseCase(AnalyticsContract analyticsContract) {
        this.f4088a = analyticsContract;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:109:0x0204  */
    /* JADX WARN: Code duplicated, block: B:111:0x0217  */
    /* JADX WARN: Code duplicated, block: B:118:0x0224  */
    /* JADX WARN: Code duplicated, block: B:132:0x0243  */
    /* JADX WARN: Code duplicated, block: B:142:0x0267  */
    /* JADX WARN: Code duplicated, block: B:145:0x0270  */
    /* JADX WARN: Code duplicated, block: B:324:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01da  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v35, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.util.ArrayList] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v11 app.chalo.juspay.JusPayUpiSessionStatus, still in use, count: 2, list:
          (r9v11 app.chalo.juspay.JusPayUpiSessionStatus) from 0x01c3: PHI (r9 I:??) = (r9v3 app.chalo.juspay.JusPayUpiSessionStatus), (r9v11 app.chalo.juspay.JusPayUpiSessionStatus) binds: [B:85:0x01c2, B:320:0x01c3] A[DONT_GENERATE, DONT_INLINE]
          (r9v11 app.chalo.juspay.JusPayUpiSessionStatus) from 0x01b7: INVOKE (r9v11 app.chalo.juspay.JusPayUpiSessionStatus) VIRTUAL call: java.lang.Enum.name():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:440)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static app.chalo.juspay.JusPaySdkResultAppModel.ProcessResult a(kotlinx.serialization.json.JsonObject r26) {
        /*
            Method dump skipped, instruction units count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.juspay.ProcessJuspayResultObjectUseCase.a(kotlinx.serialization.json.JsonObject):app.chalo.juspay.JusPaySdkResultAppModel$ProcessResult");
    }
}
