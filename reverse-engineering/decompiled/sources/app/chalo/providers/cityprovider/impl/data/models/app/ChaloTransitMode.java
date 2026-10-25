package app.chalo.providers.cityprovider.impl.data.models.app;

import defpackage.ul;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode;", "", "mode", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMode", "()Ljava/lang/String;", "BUS", "TRAIN", "METRO", "MONORAIL", "FERRY", "CAB", "ALL", "UNKNOWN", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public enum ChaloTransitMode {
    BUS("bus"),
    TRAIN("railway"),
    METRO("metro"),
    MONORAIL("monorail"),
    FERRY("ferry"),
    CAB("cab"),
    ALL("transit"),
    UNKNOWN("");

    public static final String TRIP_PLANNER_METRO_MODE = "trainish";
    private final String mode;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ul(14));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "TRIP_PLANNER_METRO_MODE", "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static ChaloTransitMode a(String transitMode, ChaloTransitMode chaloTransitMode) {
            ChaloTransitMode next;
            Intrinsics.i(transitMode, "transitMode");
            Intrinsics.i(chaloTransitMode, "default");
            Iterator<ChaloTransitMode> it = ChaloTransitMode.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.x(next.getMode(), transitMode, true));
            ChaloTransitMode chaloTransitMode2 = next;
            return chaloTransitMode2 == null ? chaloTransitMode : chaloTransitMode2;
        }

        public static /* synthetic */ ChaloTransitMode b(Companion companion, String str) {
            ChaloTransitMode chaloTransitMode = ChaloTransitMode.UNKNOWN;
            companion.getClass();
            return a(str, chaloTransitMode);
        }

        public final KSerializer<ChaloTransitMode> serializer() {
            return (KSerializer) ChaloTransitMode.$cachedSerializer$delegate.getValue();
        }
    }

    ChaloTransitMode(String str) {
        this.mode = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode", values());
    }

    public static EnumEntries<ChaloTransitMode> getEntries() {
        return $ENTRIES;
    }

    public final String getMode() {
        return this.mode;
    }
}
