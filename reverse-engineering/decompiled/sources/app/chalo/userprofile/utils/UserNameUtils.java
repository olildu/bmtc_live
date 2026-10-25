package app.chalo.userprofile.utils;

import defpackage.vm1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/utils/UserNameUtils;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserNameUtils {
    public static String a(String str, String str2) {
        List listS = CollectionsKt.S(str, str2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS) {
            if (!StringsKt.F((String) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.O(arrayList, " ", null, null, new vm1(22), 30);
    }

    public static Pair b(String name) {
        Intrinsics.i(name, "name");
        String string = StringsKt.u0(name).toString();
        if (string.length() == 0) {
            return new Pair("", "");
        }
        int iC = StringsKt.C(string, ' ', 0, 6);
        if (iC < 0) {
            return new Pair(string, "");
        }
        String strSubstring = string.substring(0, iC);
        Intrinsics.h(strSubstring, "substring(...)");
        String strSubstring2 = string.substring(iC + 1);
        Intrinsics.h(strSubstring2, "substring(...)");
        return new Pair(strSubstring, StringsKt.z0(strSubstring2).toString());
    }
}
