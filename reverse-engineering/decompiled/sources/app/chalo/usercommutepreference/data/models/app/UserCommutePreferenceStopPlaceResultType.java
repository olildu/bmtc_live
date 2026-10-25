package app.chalo.usercommutepreference.data.models.app;

import defpackage.dn1;
import java.util.Locale;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferenceStopPlaceResultType;", "", "<init>", "(Ljava/lang/String;I)V", "PLACE", "STOP", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public enum UserCommutePreferenceStopPlaceResultType {
    PLACE,
    STOP;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new dn1(14));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferenceStopPlaceResultType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferenceStopPlaceResultType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static UserCommutePreferenceStopPlaceResultType a(String str) {
            if (str == null) {
                return null;
            }
            try {
                String upperCase = str.toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase, "toUpperCase(...)");
                return UserCommutePreferenceStopPlaceResultType.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final KSerializer<UserCommutePreferenceStopPlaceResultType> serializer() {
            return (KSerializer) UserCommutePreferenceStopPlaceResultType.$cachedSerializer$delegate.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceResultType", values());
    }

    public static EnumEntries<UserCommutePreferenceStopPlaceResultType> getEntries() {
        return $ENTRIES;
    }
}
