package app.chalo.userprofile;

import defpackage.t40;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, d2 = {"Lapp/chalo/userprofile/Gender;", "", "_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "MALE", "FEMALE", "OTHER", "NULL", "toString", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public enum Gender {
    MALE("male"),
    FEMALE("female"),
    OTHER("other"),
    NULL("");

    private final String _value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new t40(9));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/userprofile/Gender$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/userprofile/Gender;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:18:0x0035 A[RETURN] */
        public static Gender a(String str, Gender fallbackGender) {
            Intrinsics.i(fallbackGender, "fallbackGender");
            if (str != null && str.length() != 0) {
                for (Gender gender : Gender.values()) {
                    if (StringsKt.x(gender._value, str, true) || StringsKt.x(gender.name(), str, true)) {
                        if (gender == null) {
                            return gender;
                        }
                    }
                }
                gender = null;
                if (gender == null) {
                    return gender;
                }
            }
            return fallbackGender;
        }

        public static /* synthetic */ Gender b(Companion companion, String str) {
            Gender gender = Gender.MALE;
            companion.getClass();
            return a(str, gender);
        }

        public final KSerializer<Gender> serializer() {
            return (KSerializer) Gender.$cachedSerializer$delegate.getValue();
        }
    }

    Gender(String str) {
        this._value = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.userprofile.Gender", values());
    }

    public static EnumEntries<Gender> getEntries() {
        return $ENTRIES;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this._value;
    }
}
