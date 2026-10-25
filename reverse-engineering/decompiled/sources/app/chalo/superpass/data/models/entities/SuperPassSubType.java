package app.chalo.superpass.data.models.entities;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassSubType;", "", "<init>", "(Ljava/lang/String;I)V", "MAGIC_SUPER_PASS", "RIDE_BASED_SUPER_PASS", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum SuperPassSubType {
    MAGIC_SUPER_PASS,
    RIDE_BASED_SUPER_PASS;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassSubType$Companion;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9571a;

            static {
                int[] iArr = new int[SuperPassSubType.values().length];
                try {
                    iArr[SuperPassSubType.MAGIC_SUPER_PASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SuperPassSubType.RIDE_BASED_SUPER_PASS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f9571a = iArr;
            }
        }

        public static SuperPassSubType a(String superPassSubTypeString) {
            Intrinsics.i(superPassSubTypeString, "superPassSubTypeString");
            if (superPassSubTypeString.equals("magicPass")) {
                return SuperPassSubType.MAGIC_SUPER_PASS;
            }
            return superPassSubTypeString.equals("rideBasedPass") ? SuperPassSubType.RIDE_BASED_SUPER_PASS : SuperPassSubType.MAGIC_SUPER_PASS;
        }

        public static String b(SuperPassSubType superPassSubType) {
            Intrinsics.i(superPassSubType, "superPassSubType");
            int i = WhenMappings.f9571a[superPassSubType.ordinal()];
            if (i == 1) {
                return "magicPass";
            }
            if (i == 2) {
                return "rideBasedPass";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static EnumEntries<SuperPassSubType> getEntries() {
        return $ENTRIES;
    }
}
