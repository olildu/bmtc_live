package app.chalo.models;

import defpackage.jg1;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lapp/chalo/models/SuperPassSubTypes;", "", "subType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSubType", "()Ljava/lang/String;", "MAGIC_SUPER_PASS", "RIDE_BASED_SUPER_PASS", "UNKNOWN", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public enum SuperPassSubTypes {
    MAGIC_SUPER_PASS("magicPass"),
    RIDE_BASED_SUPER_PASS("rideBasedPass"),
    UNKNOWN("");

    private final String subType;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new jg1(0));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/SuperPassSubTypes$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/SuperPassSubTypes;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[SuperPassSubTypes.values().length];
                try {
                    iArr[SuperPassSubTypes.MAGIC_SUPER_PASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SuperPassSubTypes.RIDE_BASED_SUPER_PASS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SuperPassSubTypes.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        public static SuperPassSubTypes a(String superPassSubTypeString) {
            Intrinsics.i(superPassSubTypeString, "superPassSubTypeString");
            if (superPassSubTypeString.equals("magicPass")) {
                return SuperPassSubTypes.MAGIC_SUPER_PASS;
            }
            return superPassSubTypeString.equals("rideBasedPass") ? SuperPassSubTypes.RIDE_BASED_SUPER_PASS : SuperPassSubTypes.UNKNOWN;
        }

        public final KSerializer<SuperPassSubTypes> serializer() {
            return (KSerializer) SuperPassSubTypes.$cachedSerializer$delegate.getValue();
        }
    }

    SuperPassSubTypes(String str) {
        this.subType = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.models.SuperPassSubTypes", values());
    }

    public static EnumEntries<SuperPassSubTypes> getEntries() {
        return $ENTRIES;
    }

    public final String getSubType() {
        return this.subType;
    }
}
