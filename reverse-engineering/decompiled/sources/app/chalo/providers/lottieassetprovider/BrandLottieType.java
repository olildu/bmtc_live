package app.chalo.providers.lottieassetprovider;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/providers/lottieassetprovider/BrandLottieType;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BrandLottieType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8862a;

        static {
            int[] iArr = new int[LottieType.values().length];
            try {
                iArr[LottieType.TAP_TUTORIAL_GIF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8862a = iArr;
        }
    }

    public abstract LottieExtensionType a();
}
