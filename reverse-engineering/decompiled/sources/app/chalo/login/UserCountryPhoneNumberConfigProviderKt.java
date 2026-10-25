package app.chalo.login;

import app.chalo.config.CountryPhoneNumberConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"login_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserCountryPhoneNumberConfigProviderKt {
    public static final CountryPhoneNumberConfig a(String str, List list) {
        Object next;
        Intrinsics.i(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.d(((CountryPhoneNumberConfig) next).f1937a.getId(), str)) {
                return (CountryPhoneNumberConfig) next;
            }
        }
        next = null;
        return (CountryPhoneNumberConfig) next;
    }
}
