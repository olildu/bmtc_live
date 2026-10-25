package app.chalo.android.adjust;

import app.chalo.features.adjust.AdjustLogLevel;
import app.chalo.features.adjust.AdjustUrlStrategy;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"androidApp_bmtcPrimaryRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class AdjustSdkDelegate_androidKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f945a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[AdjustLogLevel.values().length];
            try {
                iArr[AdjustLogLevel.SUPPRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdjustLogLevel.VERBOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdjustLogLevel.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdjustLogLevel.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f945a = iArr;
            int[] iArr2 = new int[AdjustUrlStrategy.values().length];
            try {
                iArr2[AdjustUrlStrategy.URL_STRATEGY_INDIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }
}
