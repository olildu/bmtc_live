package app.chalo.features.language.data;

import app.chalo.providers.stringprovider.StringEnum;
import defpackage.vc0;
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lapp/chalo/features/language/data/Language;", "", "locale", "", "strEnum", "Lapp/chalo/providers/stringprovider/StringEnum;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lapp/chalo/providers/stringprovider/StringEnum;)V", "getLocale", "()Ljava/lang/String;", "getStrEnum", "()Lapp/chalo/providers/stringprovider/StringEnum;", "ENGLISH", "HINDI", "TAMIL", "TELUGU", "BENGALI", "MARATHI", "MALAYALAM", "ASSAMESE", "KANNADA", "SPANISH", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public enum Language {
    ENGLISH("en", StringEnum.ENGLISH),
    HINDI("hi", StringEnum.HINDI),
    TAMIL("ta", StringEnum.TAMIL),
    TELUGU("te", StringEnum.TELUGU),
    BENGALI("bn", StringEnum.BENGALI),
    MARATHI("mr", StringEnum.MARATHI),
    MALAYALAM("ml", StringEnum.MALAYALAM),
    ASSAMESE("as", StringEnum.ASSAMESE),
    KANNADA("kn", StringEnum.KANNADA),
    SPANISH("es", StringEnum.SPANISH);

    private final String locale;
    private final StringEnum strEnum;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vc0(20));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/features/language/data/Language$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/features/language/data/Language;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static Language a(String locale) {
            Language next;
            Intrinsics.i(locale, "locale");
            Iterator<Language> it = Language.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.d(next.getLocale(), locale)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public final KSerializer<Language> serializer() {
            return (KSerializer) Language.$cachedSerializer$delegate.getValue();
        }
    }

    Language(String str, StringEnum stringEnum) {
        this.locale = str;
        this.strEnum = stringEnum;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.features.language.data.Language", values());
    }

    public static EnumEntries<Language> getEntries() {
        return $ENTRIES;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final StringEnum getStrEnum() {
        return this.strEnum;
    }
}
