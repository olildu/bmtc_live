package app.chalo.ads;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UnifiedAdDebugFixturesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f836a = MapsKt.d();
    public static final HomeUnifiedAdFixtureScenario b = HomeUnifiedAdFixtureScenario.OFF;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f837a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[UnifiedAdDebugFixtureScenario.values().length];
            try {
                iArr[UnifiedAdDebugFixtureScenario.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UnifiedAdDebugFixtureScenario.FORCE_RENDERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UnifiedAdDebugFixtureScenario.FORCE_FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f837a = iArr;
            int[] iArr2 = new int[HomeUnifiedAdFixtureScenario.values().length];
            try {
                iArr2[HomeUnifiedAdFixtureScenario.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[HomeUnifiedAdFixtureScenario.FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[HomeUnifiedAdFixtureScenario.WIDE_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[HomeUnifiedAdFixtureScenario.WIDE_NO_ICON.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[HomeUnifiedAdFixtureScenario.WIDE_HEADLINE_CTA_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[HomeUnifiedAdFixtureScenario.WIDE_HEADLINE_CTA_ONLY_NO_ICON.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[HomeUnifiedAdFixtureScenario.SPLIT_COMPLETE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[HomeUnifiedAdFixtureScenario.SPLIT_NO_ICON.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[HomeUnifiedAdFixtureScenario.SPLIT_HEADLINE_CTA_ONLY.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[HomeUnifiedAdFixtureScenario.SPLIT_HEADLINE_CTA_ONLY_NO_ICON.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            b = iArr2;
        }
    }

    public static final UnifiedAdDebugRenderedContent a(float f, boolean z, Float f2, String str, String str2) {
        return new UnifiedAdDebugRenderedContent("Test Ad : Adster-Wingwhirl", str2, str, f2, z, Float.valueOf(f));
    }
}
