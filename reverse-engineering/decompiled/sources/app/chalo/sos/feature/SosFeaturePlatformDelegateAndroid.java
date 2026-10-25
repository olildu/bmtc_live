package app.chalo.sos.feature;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;
import app.chalo.crashlytics.CrashlyticsLogger;
import defpackage.eh0;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/feature/SosFeaturePlatformDelegateAndroid;", "Lapp/chalo/sos/feature/SosFeaturePlatformDelegate;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SosFeaturePlatformDelegateAndroid implements SosFeaturePlatformDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatActivity f9438a;
    public final CrashlyticsLogger b;
    public final eh0 c;
    public Function1 d;

    public SosFeaturePlatformDelegateAndroid(AppCompatActivity appCompatActivity, CrashlyticsLogger crashlyticsLogger, eh0 eh0Var) {
        this.f9438a = appCompatActivity;
        this.b = crashlyticsLogger;
        this.c = eh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.sos.feature.SosFeaturePlatformDelegate
    public final Object a(Continuation continuation) {
        SosFeaturePlatformDelegateAndroid$pickContact$1 sosFeaturePlatformDelegateAndroid$pickContact$1;
        Uri data;
        Cursor cursorQuery;
        if (continuation instanceof SosFeaturePlatformDelegateAndroid$pickContact$1) {
            sosFeaturePlatformDelegateAndroid$pickContact$1 = (SosFeaturePlatformDelegateAndroid$pickContact$1) continuation;
            int i = sosFeaturePlatformDelegateAndroid$pickContact$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sosFeaturePlatformDelegateAndroid$pickContact$1.label = i - Integer.MIN_VALUE;
            } else {
                sosFeaturePlatformDelegateAndroid$pickContact$1 = new SosFeaturePlatformDelegateAndroid$pickContact$1(this, (ContinuationImpl) continuation);
            }
        } else {
            sosFeaturePlatformDelegateAndroid$pickContact$1 = new SosFeaturePlatformDelegateAndroid$pickContact$1(this, (ContinuationImpl) continuation);
        }
        Object objT = sosFeaturePlatformDelegateAndroid$pickContact$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = sosFeaturePlatformDelegateAndroid$pickContact$1.label;
        if (i2 == 0) {
            ResultKt.b(objT);
            sosFeaturePlatformDelegateAndroid$pickContact$1.label = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.c(sosFeaturePlatformDelegateAndroid$pickContact$1));
            cancellableContinuationImpl.u();
            this.d = new Function1<ActivityResult, Unit>() { // from class: app.chalo.sos.feature.SosFeaturePlatformDelegateAndroid$pickContact$result$1$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ActivityResult result = (ActivityResult) obj;
                    Intrinsics.i(result, "result");
                    cancellableContinuationImpl.resumeWith(result);
                    this.d = null;
                    return Unit.f17538a;
                }
            };
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setDataAndType(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, "vnd.android.cursor.dir/phone_v2");
            this.c.invoke(intent);
            objT = cancellableContinuationImpl.t();
            if (objT == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objT);
        }
        ActivityResult activityResult = (ActivityResult) objT;
        if (activityResult.getResultCode() != -1) {
            return SosPickContactResult.Cancelled.f9441a;
        }
        Intent data2 = activityResult.getData();
        if (data2 == null || (data = data2.getData()) == null) {
            return new SosPickContactResult.Error("Invalid data");
        }
        try {
            String[] strArr = {"contact_id", "display_name", "data1"};
            ContentResolver contentResolver = this.f9438a.getContentResolver();
            if (contentResolver == null || (cursorQuery = contentResolver.query(data, strArr, null, null, null)) == null) {
                return new SosPickContactResult.Error("Query failed");
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    SosPickContactResult.Error error = new SosPickContactResult.Error("Cursor empty");
                    cursorQuery.close();
                    return error;
                }
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("contact_id");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("display_name");
                int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("data1");
                String string = cursorQuery.getString(columnIndexOrThrow);
                Intrinsics.h(string, "getString(...)");
                String string2 = cursorQuery.getString(columnIndexOrThrow3);
                Intrinsics.h(string2, "getString(...)");
                String string3 = cursorQuery.getString(columnIndexOrThrow2);
                Intrinsics.h(string3, "getString(...)");
                SosPickContactResult.Success success = new SosPickContactResult.Success(new SosContact(string, string2, string3));
                cursorQuery.close();
                return success;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.a(cursorQuery, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.b.i(e);
            return new SosPickContactResult.Error(e.getMessage());
        }
    }

    @Override // app.chalo.sos.feature.SosFeaturePlatformDelegate
    public final boolean b(String msg, List contacts) {
        Intrinsics.i(contacts, "contacts");
        Intrinsics.i(msg, "msg");
        List list = contacts;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SosContact) it.next()).b);
        }
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(vo1.m("smsto:", CollectionsKt.O(arrayList, null, null, null, null, 63))));
        intent.putExtra("sms_body", msg);
        intent.setFlags(268435456);
        AppCompatActivity appCompatActivity = this.f9438a;
        if (intent.resolveActivity(appCompatActivity.getPackageManager()) == null) {
            return false;
        }
        appCompatActivity.startActivity(intent);
        return true;
    }
}
