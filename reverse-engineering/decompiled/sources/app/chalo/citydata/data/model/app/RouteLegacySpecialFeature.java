package app.chalo.citydata.data.model.app;

import defpackage.y21;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteLegacySpecialFeature;", "", "<init>", "(Ljava/lang/String;I)V", "FAST", "AC", "BOGGIE_12", "BOGGIE_9", "BOGGIE_15", "LADIES_ONLY", "UNKNOWN", "Companion", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public enum RouteLegacySpecialFeature {
    FAST,
    AC,
    BOGGIE_12,
    BOGGIE_9,
    BOGGIE_15,
    LADIES_ONLY,
    UNKNOWN;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new y21(29));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteLegacySpecialFeature$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/app/RouteLegacySpecialFeature;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:12:0x0023 A[RETURN] */
        public static RouteLegacySpecialFeature a(String featureName) {
            Intrinsics.i(featureName, "featureName");
            for (RouteLegacySpecialFeature routeLegacySpecialFeature : RouteLegacySpecialFeature.values()) {
                if (Intrinsics.d(routeLegacySpecialFeature.name(), featureName)) {
                    if (routeLegacySpecialFeature == null) {
                        return RouteLegacySpecialFeature.UNKNOWN;
                    }
                    return routeLegacySpecialFeature;
                }
            }
            routeLegacySpecialFeature = null;
            if (routeLegacySpecialFeature == null) {
                return RouteLegacySpecialFeature.UNKNOWN;
            }
            return routeLegacySpecialFeature;
        }

        public final KSerializer<RouteLegacySpecialFeature> serializer() {
            return (KSerializer) RouteLegacySpecialFeature.$cachedSerializer$delegate.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.citydata.data.model.app.RouteLegacySpecialFeature", values());
    }

    public static EnumEntries<RouteLegacySpecialFeature> getEntries() {
        return $ENTRIES;
    }
}
