package app.chalo.behaviour.policy;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/PolicyResolverHelper;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PolicyResolverHelper {
    public static Object a(String str, Map map) {
        Object next;
        if (str != null) {
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.x((String) ((Map.Entry) next).getKey(), str, true));
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                return entry.getValue();
            }
        }
        return null;
    }

    public static Object b(Object obj, PolicyRemoteConfig policyRemoteConfig, PolicyResolutionContext context, Object obj2, Function2 merge) {
        Map map;
        Map map2;
        Map map3;
        Intrinsics.i(context, "context");
        Intrinsics.i(merge, "merge");
        String str = context.b;
        String str2 = context.f1019a;
        Object objA = null;
        PolicyConfigGroup policyConfigGroup = policyRemoteConfig != null ? policyRemoteConfig.f1017a : null;
        PolicyConfigGroup policyConfigGroup2 = (policyRemoteConfig == null || (map3 = policyRemoteConfig.b) == null) ? null : (PolicyConfigGroup) a(str2, map3);
        Object objInvoke = merge.invoke(merge.invoke(merge.invoke(merge.invoke(obj, policyConfigGroup != null ? policyConfigGroup.f1014a : null), (policyConfigGroup == null || (map2 = policyConfigGroup.b) == null) ? null : a(str, map2)), obj2), policyConfigGroup2 != null ? policyConfigGroup2.f1014a : null);
        if (policyConfigGroup2 != null && (map = policyConfigGroup2.b) != null) {
            objA = a(str, map);
        }
        return merge.invoke(objInvoke, objA);
    }
}
