package app.chalo.data;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0010"}, d2 = {"Lapp/chalo/data/BackgroundStyle;", "", "bgStyle", "", "shape", "Lapp/chalo/data/BackgroundShape;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lapp/chalo/data/BackgroundShape;)V", "getShape", "()Lapp/chalo/data/BackgroundShape;", "CHALO_TAG", "CHALO_BUS_TAG", "UNKNOWN", "toUiShape", "Lapp/chalo/compose/theme/UIShape;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum BackgroundStyle {
    CHALO_TAG("CHALO_TAG", new BackgroundShape.Rectangle(20)),
    CHALO_BUS_TAG("CHALO_BUS_TAG", new BackgroundShape.Rectangle(8)),
    UNKNOWN("UNKNOWN", new BackgroundShape.Rectangle(0));

    private final String bgStyle;
    private final BackgroundShape shape;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/BackgroundStyle$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2314a;

        static {
            int[] iArr = new int[BackgroundStyle.values().length];
            try {
                iArr[BackgroundStyle.CHALO_TAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BackgroundStyle.CHALO_BUS_TAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BackgroundStyle.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2314a = iArr;
        }
    }

    BackgroundStyle(String str, BackgroundShape backgroundShape) {
        this.bgStyle = str;
        this.shape = backgroundShape;
    }

    public static EnumEntries<BackgroundStyle> getEntries() {
        return $ENTRIES;
    }

    public final BackgroundShape getShape() {
        return this.shape;
    }

    public final UIShape toUiShape() {
        int i = WhenMappings.f2314a[ordinal()];
        if (i == 1) {
            float f = ChaloThemeHelper.a().W;
            return new UIShape.Rectangle(f, f, f, f);
        }
        if (i == 2) {
            float f2 = ChaloThemeHelper.a().f;
            return new UIShape.Rectangle(f2, f2, f2, f2);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        float f3 = ChaloThemeHelper.a().f1916a;
        return new UIShape.Rectangle(f3, f3, f3, f3);
    }
}
