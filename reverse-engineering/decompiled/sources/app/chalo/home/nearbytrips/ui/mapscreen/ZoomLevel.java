package app.chalo.home.nearbytrips.ui.mapscreen;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/ZoomLevel;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "ZOOMED_IN", "ZOOMED_OUT", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ZoomLevel {
    NORMAL,
    ZOOMED_IN,
    ZOOMED_OUT;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/ui/mapscreen/ZoomLevel$Companion;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3167a;

            static {
                int[] iArr = new int[ChaloTransitMode.values().length];
                try {
                    iArr[ChaloTransitMode.BUS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ChaloTransitMode.TRAIN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ChaloTransitMode.METRO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ChaloTransitMode.MONORAIL.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ChaloTransitMode.FERRY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ChaloTransitMode.CAB.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ChaloTransitMode.ALL.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ChaloTransitMode.UNKNOWN.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f3167a = iArr;
            }
        }

        public static ZoomLevel a(float f, ChaloTransitMode transitMode) {
            float f2;
            Intrinsics.i(transitMode, "transitMode");
            switch (WhenMappings.f3167a[transitMode.ordinal()]) {
                case 1:
                    f2 = 14.0f;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    f2 = 12.0f;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (f >= 18.0f) {
                return ZoomLevel.ZOOMED_IN;
            }
            return f <= f2 ? ZoomLevel.ZOOMED_OUT : ZoomLevel.NORMAL;
        }
    }

    public static EnumEntries<ZoomLevel> getEntries() {
        return $ENTRIES;
    }
}
