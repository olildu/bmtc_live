package app.chalo.config;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 app.chalo.config.ChaloPhoneNumberCountry, still in use, count: 1, list:
  (r0v0 app.chalo.config.ChaloPhoneNumberCountry) from 0x005b: SPUT (r0v0 app.chalo.config.ChaloPhoneNumberCountry) (LINE:92) app.chalo.config.ChaloPhoneNumberCountry.Default app.chalo.config.ChaloPhoneNumberCountry
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lapp/chalo/config/ChaloPhoneNumberCountry;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "India", "Philippines", "Thailand", "Fiji", "Peru", "Unknown", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloPhoneNumberCountry {
    India("IND"),
    Philippines("PHL"),
    Thailand("THA"),
    Fiji("FJI"),
    Peru("PER"),
    Unknown("UNKNOWN");

    private final String id;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final ChaloPhoneNumberCountry Default = new ChaloPhoneNumberCountry("IND");

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/config/ChaloPhoneNumberCountry$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
        public static ChaloPhoneNumberCountry a(String str) {
            for (ChaloPhoneNumberCountry chaloPhoneNumberCountry : ChaloPhoneNumberCountry.values()) {
                if (Intrinsics.d(chaloPhoneNumberCountry.getId(), str)) {
                    if (chaloPhoneNumberCountry == null) {
                        return ChaloPhoneNumberCountry.Unknown;
                    }
                    return chaloPhoneNumberCountry;
                }
            }
            chaloPhoneNumberCountry = null;
            if (chaloPhoneNumberCountry == null) {
                return ChaloPhoneNumberCountry.Unknown;
            }
            return chaloPhoneNumberCountry;
        }
    }

    static {
    }

    private ChaloPhoneNumberCountry(String str) {
        super(str, i);
        this.id = str;
    }

    public static EnumEntries<ChaloPhoneNumberCountry> getEntries() {
        return $ENTRIES;
    }

    public static ChaloPhoneNumberCountry valueOf(String str) {
        return (ChaloPhoneNumberCountry) Enum.valueOf(ChaloPhoneNumberCountry.class, str);
    }

    public static ChaloPhoneNumberCountry[] values() {
        return (ChaloPhoneNumberCountry[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
