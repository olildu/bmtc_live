package app.chalo.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.webkit.internal.AssetHelper;
import app.chalo.location.LatLng;
import defpackage.n21;
import defpackage.vo1;
import in.juspay.airborne.ota.Constants;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/AndroidSystemHelper;", "Lapp/chalo/utils/SystemHelper;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidSystemHelper implements SystemHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10414a;

    public AndroidSystemHelper(Context context) {
        this.f10414a = context;
    }

    @Override // app.chalo.utils.SystemHelper
    public final ChaloUseCaseResult a(String bookingId, byte[] invoiceBytes) {
        Context context = this.f10414a;
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(invoiceBytes, "invoiceBytes");
        try {
            File file = new File(context.getCacheDir(), "invoice_" + bookingId + ".pdf");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(invoiceBytes);
                fileOutputStream.close();
                Uri uriForFile = FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".fileprovider", file);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(uriForFile, "application/pdf");
                intent.addFlags(1);
                try {
                    Intent intentCreateChooser = Intent.createChooser(intent, "Open invoice with");
                    intentCreateChooser.addFlags(268435456);
                    context.startActivity(intentCreateChooser);
                    return new ChaloUseCaseResult.Success(Unit.f17538a);
                } catch (ActivityNotFoundException unused) {
                    return new ChaloUseCaseResult.Failure("Please install a PDF viewer to open the invoice.");
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.a(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ChaloUseCaseResult.Failure("Unable to open the invoice.");
        }
    }

    @Override // app.chalo.utils.SystemHelper
    public final void b() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        Context context = this.f10414a;
        intent.setData(Uri.fromParts(Constants.PACKAGE_DIR_NAME, context.getPackageName(), null));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    @Override // app.chalo.utils.SystemHelper
    public final String c() {
        return vo1.m("https://play.google.com/store/apps/details?id=", this.f10414a.getPackageName());
    }

    @Override // app.chalo.utils.SystemHelper
    public final void d(String contactNumber) {
        Intrinsics.i(contactNumber, "contactNumber");
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("tel:" + Uri.encode(StringsKt.u0(contactNumber).toString())));
        this.f10414a.startActivity(intent);
    }

    @Override // app.chalo.utils.SystemHelper
    public final long e(ElapsedRealTimeClock clock) {
        Intrinsics.i(clock, "clock");
        return SystemClock.elapsedRealtime();
    }

    @Override // app.chalo.utils.SystemHelper
    public final void f() {
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        Context context = this.f10414a;
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    @Override // app.chalo.utils.SystemHelper
    public final ChaloUseCaseResult g() {
        Context context = this.f10414a;
        String packageName = context.getPackageName();
        if (packageName == null) {
            return new ChaloUseCaseResult.Failure(new ForceAppUpdateError.AndroidStringIsNull());
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=".concat(packageName)));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=".concat(packageName))));
        }
        return new ChaloUseCaseResult.Success(Unit.f17538a);
    }

    @Override // app.chalo.utils.SystemHelper
    public final void h(LatLng location, String locationName) {
        Intrinsics.i(locationName, "locationName");
        Intrinsics.i(location, "location");
        double d = location.f5134a;
        double d2 = location.b;
        StringBuilder sbI = n21.i(d, "geo:0,0?q=", ",");
        sbI.append(d2);
        sbI.append("(");
        sbI.append(locationName);
        sbI.append(")");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sbI.toString()));
        intent.setPackage("com.google.android.apps.maps");
        intent.setFlags(268435456);
        Context context = this.f10414a;
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            Toast.makeText(context, "No suitable app found", 1).show();
        } else if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }

    @Override // app.chalo.utils.SystemHelper
    public final void i() {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setFlags(268435456);
        this.f10414a.startActivity(intent);
    }

    @Override // app.chalo.utils.SystemHelper
    public final long j() {
        return System.currentTimeMillis();
    }

    @Override // app.chalo.utils.SystemHelper
    public final void k(String title, String data, String str) {
        Intrinsics.i(title, "title");
        Intrinsics.i(data, "data");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", data);
        if (str != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str);
        }
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        this.f10414a.startActivity(Intent.createChooser(intent, title).setFlags(268435456));
    }
}
