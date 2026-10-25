package app.chalo.ridefeedback.domain;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.ProductFlavor;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/domain/FetchRideFeedbackRemoteConfigListUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchRideFeedbackRemoteConfigListUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f9077a;
    public final CrashlyticsLogger b;
    public final ChaloBuildConfig c;
    public final BasicInfoContract d;
    public List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9078a;

        static {
            int[] iArr = new int[ProductFlavor.values().length];
            try {
                iArr[ProductFlavor.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductFlavor.BETA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductFlavor.ALPHA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9078a = iArr;
        }
    }

    public FetchRideFeedbackRemoteConfigListUseCase(ChaloBuildConfig chaloBuildConfig, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature) {
        this.f9077a = chaloConfigFeature;
        this.b = crashlyticsLogger;
        this.c = chaloBuildConfig;
        this.d = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r8 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r8 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        if (r8 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ridefeedback.domain.FetchRideFeedbackRemoteConfigListUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
