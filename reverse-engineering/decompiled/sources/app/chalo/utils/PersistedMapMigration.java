package app.chalo.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.core.DataMigration;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import app.chalo.utils.PersistedMapMigration;
import defpackage.qe0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/utils/PersistedMapMigration;", "Landroidx/datastore/core/DataMigration;", "Landroidx/datastore/preferences/core/Preferences;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PersistedMapMigration implements DataMigration<Preferences> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10435a;
    public final String b;
    public final String c;
    public final Function2 d;
    public final LinkedHashSet e;
    public final Lazy f;
    public final Lazy g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/PersistedMapMigration$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public PersistedMapMigration(Set set, Context context, String str, String str2) {
        this(set, context, str, str2, new qe0(28));
    }

    public final Map a() {
        JSONObject jSONObject = (JSONObject) this.g.getValue();
        if (jSONObject == null) {
            return MapsKt.d();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.h(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            LinkedHashSet linkedHashSet = this.e;
            if (linkedHashSet == null || linkedHashSet.contains(next)) {
                Object objOpt = jSONObject.opt(next);
                if (objOpt != null) {
                    linkedHashMap.put(next, objOpt);
                }
            }
        }
        return linkedHashMap;
    }

    @Override // androidx.datastore.core.DataMigration
    public final Object cleanUp(Continuation continuation) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = (JSONObject) this.g.getValue();
        Unit unit = Unit.f17538a;
        if (jSONObject2 == null) {
            return unit;
        }
        Object value = this.f.getValue();
        Intrinsics.h(value, "getValue(...)");
        SharedPreferences.Editor editorEdit = ((SharedPreferences) value).edit();
        LinkedHashSet linkedHashSet = this.e;
        if (linkedHashSet == null) {
            jSONObject = new JSONObject();
        } else {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                jSONObject2.remove((String) it.next());
            }
            jSONObject = new JSONObject(jSONObject2.toString());
        }
        editorEdit.putString(this.c, jSONObject.toString());
        editorEdit.apply();
        return unit;
    }

    @Override // androidx.datastore.core.DataMigration
    public final Object migrate(Preferences preferences, Continuation<? super Preferences> continuation) {
        Preferences preferences2 = preferences;
        Set<Preferences.Key<?>> setKeySet = preferences2.asMap().keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.v(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Preferences.Key) it.next()).getName());
        }
        Map mapA = a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapA.entrySet()) {
            if (!arrayList.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        MutablePreferences mutablePreferences = preferences2.toMutablePreferences();
        this.d.invoke(linkedHashMap, mutablePreferences);
        return mutablePreferences.toPreferences();
    }

    @Override // androidx.datastore.core.DataMigration
    public final Object shouldMigrate(Preferences preferences, Continuation continuation) {
        JSONObject jSONObject = (JSONObject) this.g.getValue();
        boolean z = false;
        if (jSONObject != null) {
            LinkedHashSet linkedHashSet = this.e;
            if (linkedHashSet == null) {
                if (!a().isEmpty()) {
                    z = true;
                    break;
                }
            } else if (!linkedHashSet.isEmpty()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (jSONObject.has((String) it.next())) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public PersistedMapMigration(Set keysToMigrate, Context context, String str, String str2, Function2 function2) {
        Intrinsics.i(keysToMigrate, "keysToMigrate");
        this.f10435a = context;
        this.b = str;
        this.c = str2;
        this.d = function2;
        this.e = keysToMigrate.isEmpty() ? null : CollectionsKt.F0(keysToMigrate);
        final int i = 0;
        this.f = LazyKt.b(new Function0(this) { // from class: rr0
            public final /* synthetic */ PersistedMapMigration b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PersistedMapMigration persistedMapMigration = this.b;
                        return persistedMapMigration.f10435a.getSharedPreferences(persistedMapMigration.b, 0);
                    default:
                        PersistedMapMigration persistedMapMigration2 = this.b;
                        Object value = persistedMapMigration2.f.getValue();
                        Intrinsics.h(value, "getValue(...)");
                        String string = ((SharedPreferences) value).getString(persistedMapMigration2.c, "");
                        try {
                            return new JSONObject(string != null ? string : "");
                        } catch (Exception unused) {
                            return null;
                        }
                }
            }
        });
        final int i2 = 1;
        this.g = LazyKt.b(new Function0(this) { // from class: rr0
            public final /* synthetic */ PersistedMapMigration b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PersistedMapMigration persistedMapMigration = this.b;
                        return persistedMapMigration.f10435a.getSharedPreferences(persistedMapMigration.b, 0);
                    default:
                        PersistedMapMigration persistedMapMigration2 = this.b;
                        Object value = persistedMapMigration2.f.getValue();
                        Intrinsics.h(value, "getValue(...)");
                        String string = ((SharedPreferences) value).getString(persistedMapMigration2.c, "");
                        try {
                            return new JSONObject(string != null ? string : "");
                        } catch (Exception unused) {
                            return null;
                        }
                }
            }
        });
    }
}
