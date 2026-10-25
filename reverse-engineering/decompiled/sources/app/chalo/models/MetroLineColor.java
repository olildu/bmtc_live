package app.chalo.models;

import app.chalo.uistate.base.ChaloColorToken;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 app.chalo.models.MetroLineColor, still in use, count: 1, list:
  (r0v0 app.chalo.models.MetroLineColor) from 0x0049: CONSTRUCTOR 
  (r0v0 app.chalo.models.MetroLineColor)
  (wrap app.chalo.uistate.base.ChaloColorToken$DarkRed:0x0047: SGET  A[WRAPPED] (LINE:72) app.chalo.uistate.base.ChaloColorToken.DarkRed.a app.chalo.uistate.base.ChaloColorToken$DarkRed)
 A[MD:(java.lang.Object, java.lang.Object):void (m), WRAPPED] (LINE:74) call: kotlin.Pair.<init>(java.lang.Object, java.lang.Object):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lapp/chalo/models/MetroLineColor;", "", "colorName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getColorName", "()Ljava/lang/String;", "RED", "YELLOW", "BLUE", "UNDEFINED", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MetroLineColor {
    RED("red"),
    YELLOW("yellow"),
    BLUE("blue"),
    UNDEFINED("");

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final Map<MetroLineColor, ChaloColorToken> lineColorToChaloColorTokenMap;
    private final String colorName;

    static {
        MetroLineColor[] metroLineColorArrValues = values();
        $ENTRIES = EnumEntriesKt.a(metroLineColorArrValues);
        INSTANCE = new Companion();
        lineColorToChaloColorTokenMap = MapsKt.i(new Pair(metroLineColor, ChaloColorToken.DarkRed.f9786a), new Pair(metroLineColor, ChaloColorToken.Yellow.f9872a), new Pair(metroLineColor, ChaloColorToken.Blue.f9770a), new Pair(metroLineColor, ChaloColorToken.ShadyGray.f9851a));
    }

    private MetroLineColor(String str) {
        super(str, i);
        this.colorName = str;
    }

    public static EnumEntries<MetroLineColor> getEntries() {
        return $ENTRIES;
    }

    public static MetroLineColor valueOf(String str) {
        return (MetroLineColor) Enum.valueOf(MetroLineColor.class, str);
    }

    public static MetroLineColor[] values() {
        return (MetroLineColor[]) $VALUES.clone();
    }

    public final String getColorName() {
        return this.colorName;
    }
}
