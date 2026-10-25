package app.chalo.HomeDestinationTabType;

import defpackage.yv;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lapp/chalo/HomeDestinationTabType/DestinationTabType;", "", "destinationTabType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDestinationTabType", "()Ljava/lang/String;", "HOME", "REGULAR_BUS", "CHALO_BUS", "MY_TICKETS", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public enum DestinationTabType {
    HOME("HOME"),
    REGULAR_BUS("REGULAR_BUS"),
    CHALO_BUS("CHALO_BUS"),
    MY_TICKETS("MY_TICKETS");

    private final String destinationTabType;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yv(10));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/HomeDestinationTabType/DestinationTabType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/HomeDestinationTabType/DestinationTabType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static DestinationTabType a(String destinationTabType) {
            DestinationTabType next;
            Intrinsics.i(destinationTabType, "destinationTabType");
            Iterator<DestinationTabType> it = DestinationTabType.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (destinationTabType.equals(next.getDestinationTabType())) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public final KSerializer<DestinationTabType> serializer() {
            return (KSerializer) DestinationTabType.$cachedSerializer$delegate.getValue();
        }
    }

    DestinationTabType(String str) {
        this.destinationTabType = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.HomeDestinationTabType.DestinationTabType", values());
    }

    public static EnumEntries<DestinationTabType> getEntries() {
        return $ENTRIES;
    }

    public final String getDestinationTabType() {
        return this.destinationTabType;
    }
}
