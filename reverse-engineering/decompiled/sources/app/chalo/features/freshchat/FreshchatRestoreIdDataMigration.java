package app.chalo.features.freshchat;

import android.content.Context;
import android.content.SharedPreferences;
import app.chalo.extensions.AnyExtsKt;
import app.chalo.features.freshchat.FreshchatRestoreIdDataMigration;
import app.chalo.usecase.GetDistinctIdUseCase;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/freshchat/FreshchatRestoreIdDataMigration;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FreshchatRestoreIdDataMigration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2716a;
    public final FreshchatUserDataHandler b;
    public final Lazy c;
    public final Lazy d;

    public FreshchatRestoreIdDataMigration(Context context, FreshchatUserDataHandler freshchatUserDataHandler) {
        this.f2716a = context;
        this.b = freshchatUserDataHandler;
        final int i = 0;
        this.c = LazyKt.b(new Function0(this) { // from class: k50
            public final /* synthetic */ FreshchatRestoreIdDataMigration b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.b.f2716a.getSharedPreferences("config", 0);
                    default:
                        Object value = this.b.c.getValue();
                        Intrinsics.h(value, "getValue(...)");
                        String string = ((SharedPreferences) value).getString("config_properties", "");
                        try {
                            return new JSONObject(string != null ? string : "");
                        } catch (Exception unused) {
                            return null;
                        }
                }
            }
        });
        final int i2 = 1;
        this.d = LazyKt.b(new Function0(this) { // from class: k50
            public final /* synthetic */ FreshchatRestoreIdDataMigration b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.b.f2716a.getSharedPreferences("config", 0);
                    default:
                        Object value = this.b.c.getValue();
                        Intrinsics.h(value, "getValue(...)");
                        String string = ((SharedPreferences) value).getString("config_properties", "");
                        try {
                            return new JSONObject(string != null ? string : "");
                        } catch (Exception unused) {
                            return null;
                        }
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:56:0x011d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(ContinuationImpl continuationImpl) throws JSONException {
        FreshchatRestoreIdDataMigration$migrate$1 freshchatRestoreIdDataMigration$migrate$1;
        JSONObject jSONObject;
        SharedPreferences.Editor editorEdit;
        JSONObject jSONObject2;
        SharedPreferences.Editor editor;
        String str;
        String str2;
        FreshchatUserDataHandler freshchatUserDataHandler = this.b;
        GetDistinctIdUseCase getDistinctIdUseCase = freshchatUserDataHandler.f2718a;
        if (continuationImpl instanceof FreshchatRestoreIdDataMigration$migrate$1) {
            freshchatRestoreIdDataMigration$migrate$1 = (FreshchatRestoreIdDataMigration$migrate$1) continuationImpl;
            int i = freshchatRestoreIdDataMigration$migrate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                freshchatRestoreIdDataMigration$migrate$1.label = i - Integer.MIN_VALUE;
            } else {
                freshchatRestoreIdDataMigration$migrate$1 = new FreshchatRestoreIdDataMigration$migrate$1(this, continuationImpl);
            }
        } else {
            freshchatRestoreIdDataMigration$migrate$1 = new FreshchatRestoreIdDataMigration$migrate$1(this, continuationImpl);
        }
        Object objF = freshchatRestoreIdDataMigration$migrate$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = freshchatRestoreIdDataMigration$migrate$1.label;
        int i3 = 0;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objF);
            freshchatRestoreIdDataMigration$migrate$1.label = 1;
            String strA = getDistinctIdUseCase.a(false);
            String strConcat = strA != null ? strA.concat("_freshchatRestoreId") : null;
            objF = strConcat == null ? null : freshchatUserDataHandler.b.f(strConcat, freshchatRestoreIdDataMigration$migrate$1);
            if (objF != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = freshchatRestoreIdDataMigration$migrate$1.I$0;
                editor = (SharedPreferences.Editor) freshchatRestoreIdDataMigration$migrate$1.L$3;
                editorEdit = (SharedPreferences.Editor) freshchatRestoreIdDataMigration$migrate$1.L$2;
                str2 = (String) freshchatRestoreIdDataMigration$migrate$1.L$1;
                jSONObject2 = (JSONObject) freshchatRestoreIdDataMigration$migrate$1.L$0;
                ResultKt.b(objF);
                jSONObject2.remove(str2);
                editor.putString("config_properties", jSONObject2.toString());
                if (i3 != 0) {
                    editorEdit.commit();
                    return unit;
                }
                editorEdit.apply();
                return unit;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = freshchatRestoreIdDataMigration$migrate$1.I$0;
            editor = (SharedPreferences.Editor) freshchatRestoreIdDataMigration$migrate$1.L$3;
            editorEdit = (SharedPreferences.Editor) freshchatRestoreIdDataMigration$migrate$1.L$2;
            str = (String) freshchatRestoreIdDataMigration$migrate$1.L$1;
            jSONObject2 = (JSONObject) freshchatRestoreIdDataMigration$migrate$1.L$0;
            ResultKt.b(objF);
            jSONObject2.remove(str);
            editor.putString("config_properties", jSONObject2.toString());
            if (i3 != 0) {
                editorEdit.commit();
                return unit;
            }
            editorEdit.apply();
            return unit;
        }
        ResultKt.b(objF);
        if (!AnyExtsKt.a((String) objF) && (jSONObject = (JSONObject) this.d.getValue()) != null) {
            String strA2 = getDistinctIdUseCase.a(false);
            String strConcat2 = strA2 != null ? strA2.concat("_freshchatRestoreId") : null;
            Object value = this.c.getValue();
            Intrinsics.h(value, "getValue(...)");
            editorEdit = ((SharedPreferences) value).edit();
            if (strConcat2 != null && jSONObject.has(strConcat2)) {
                String string = jSONObject.getString(strConcat2);
                Intrinsics.f(string);
                freshchatRestoreIdDataMigration$migrate$1.L$0 = jSONObject;
                freshchatRestoreIdDataMigration$migrate$1.L$1 = strConcat2;
                freshchatRestoreIdDataMigration$migrate$1.L$2 = editorEdit;
                freshchatRestoreIdDataMigration$migrate$1.L$3 = editorEdit;
                freshchatRestoreIdDataMigration$migrate$1.I$0 = 0;
                freshchatRestoreIdDataMigration$migrate$1.label = 2;
                if (freshchatUserDataHandler.a(string, freshchatRestoreIdDataMigration$migrate$1) != coroutineSingletons) {
                    jSONObject2 = jSONObject;
                    editor = editorEdit;
                    str2 = strConcat2;
                    jSONObject2.remove(str2);
                    editor.putString("config_properties", jSONObject2.toString());
                    if (i3 != 0) {
                        editorEdit.commit();
                        return unit;
                    }
                    editorEdit.apply();
                }
            } else if (jSONObject.has("freshchatRestoreId")) {
                String string2 = jSONObject.getString("freshchatRestoreId");
                Intrinsics.f(string2);
                freshchatRestoreIdDataMigration$migrate$1.L$0 = jSONObject;
                freshchatRestoreIdDataMigration$migrate$1.L$1 = "freshchatRestoreId";
                freshchatRestoreIdDataMigration$migrate$1.L$2 = editorEdit;
                freshchatRestoreIdDataMigration$migrate$1.L$3 = editorEdit;
                freshchatRestoreIdDataMigration$migrate$1.I$0 = 0;
                freshchatRestoreIdDataMigration$migrate$1.label = 3;
                if (freshchatUserDataHandler.a(string2, freshchatRestoreIdDataMigration$migrate$1) != coroutineSingletons) {
                    jSONObject2 = jSONObject;
                    editor = editorEdit;
                    str = "freshchatRestoreId";
                    jSONObject2.remove(str);
                    editor.putString("config_properties", jSONObject2.toString());
                    if (i3 != 0) {
                        editorEdit.commit();
                        return unit;
                    }
                    editorEdit.apply();
                }
            }
            return coroutineSingletons;
        }
        return unit;
    }
}
