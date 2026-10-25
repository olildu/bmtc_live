package app.chalo.features.language;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.os.LocaleListCompat;
import app.chalo.features.language.data.Language;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/language/AndroidLanguagePlatformHelper;", "Lapp/chalo/features/language/LanguagePlatformHelper;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidLanguagePlatformHelper implements LanguagePlatformHelper {
    @Override // app.chalo.features.language.LanguagePlatformHelper
    public final String a() {
        String string = Locale.getDefault().toString();
        Intrinsics.h(string, "toString(...)");
        String strSubstring = string.substring(0, 2);
        Intrinsics.h(strSubstring, "substring(...)");
        Language language = Language.MARATHI;
        if (strSubstring.equals(language.getLocale())) {
            return language.getLocale();
        }
        Language language2 = Language.HINDI;
        if (strSubstring.equals(language2.getLocale())) {
            return language2.getLocale();
        }
        Language language3 = Language.BENGALI;
        if (strSubstring.equals(language3.getLocale())) {
            return language3.getLocale();
        }
        Language language4 = Language.SPANISH;
        return strSubstring.equals(language4.getLocale()) ? language4.getLocale() : Language.ENGLISH.getLocale();
    }

    @Override // app.chalo.features.language.LanguagePlatformHelper
    public final void b(Language language) {
        Intrinsics.i(language, "language");
        AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags(language.getLocale()));
    }

    @Override // app.chalo.features.language.LanguagePlatformHelper
    public final String c() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.h(language, "getLanguage(...)");
        return language;
    }
}
