package defpackage;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.sqlite.db.SupportSQLiteProgram;
import app.chalo.network.interceptor.TimeoutInterceptor;
import app.chalo.network.okhttp.OkHttpClientConfiguration;
import app.chalo.network.utils.SecureJNI;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsZoomedImageState;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState;
import com.chuckerteam.chucker.api.ChuckerInterceptor;
import com.chuckerteam.chucker.api.RetentionManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17462a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k4(int i, Collection collection) {
        this.f17462a = 8;
        this.b = i;
        this.c = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f17462a;
        Unit unit = Unit.f17538a;
        Object obj2 = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                OkHttpClient.Builder config = (OkHttpClient.Builder) obj;
                Intrinsics.i(config, "$this$config");
                SecureJNI secureJNI = SecureJNI.INSTANCE;
                String[] strArr = {secureJNI.getPKP1c(), secureJNI.getPKP2c(), secureJNI.getPKP3c()};
                String[] strArr2 = {secureJNI.getPKP1z(), secureJNI.getPKP2c(), secureJNI.getPKP3c()};
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(secureJNI.getc(), strArr);
                linkedHashMap.put(secureJNI.getz(), strArr2);
                RetentionManager.Period retentionPeriod = RetentionManager.Period.ONE_WEEK;
                Intrinsics.i(retentionPeriod, "retentionPeriod");
                EmptySet headerNames = EmptySet.f17559a;
                Intrinsics.i(headerNames, "headerNames");
                List listS = CollectionsKt.S(new ChuckerInterceptor(), (TimeoutInterceptor) obj2);
                OkHttpClientConfiguration okHttpClientConfiguration = new OkHttpClientConfiguration(linkedHashMap, listS, EmptyList.f17557a, i2);
                Iterator it = listS.iterator();
                while (it.hasNext()) {
                    config.addInterceptor((Interceptor) it.next());
                }
                Iterator it2 = okHttpClientConfiguration.c.iterator();
                while (it2.hasNext()) {
                    config.addNetworkInterceptor((Interceptor) it2.next());
                }
                config.connectionPool(new ConnectionPool(okHttpClientConfiguration.d, 60L, TimeUnit.SECONDS));
                config.connectionSpecs(CollectionsKt.R(new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build()));
                CertificatePinner.Builder builder = new CertificatePinner.Builder();
                for (Map.Entry entry : okHttpClientConfiguration.f6499a.entrySet()) {
                    for (Object obj3 : (Object[]) entry.getValue()) {
                        builder.add((String) entry.getKey(), (String) obj3);
                    }
                }
                config.certificatePinner(builder.build());
                return unit;
            case 1:
                Boolean bool = (Boolean) obj2;
                SupportSQLiteProgram it3 = (SupportSQLiteProgram) obj;
                Intrinsics.i(it3, "it");
                if (bool == null) {
                    it3.bindNull(i2 + 1);
                } else {
                    it3.bindLong(i2 + 1, bool.booleanValue() ? 1L : 0L);
                }
                return unit;
            case 2:
                Double d = (Double) obj2;
                SupportSQLiteProgram it4 = (SupportSQLiteProgram) obj;
                Intrinsics.i(it4, "it");
                int i3 = i2 + 1;
                if (d == null) {
                    it4.bindNull(i3);
                } else {
                    it4.bindDouble(i3, d.doubleValue());
                }
                return unit;
            case 3:
                Long l = (Long) obj2;
                SupportSQLiteProgram it5 = (SupportSQLiteProgram) obj;
                Intrinsics.i(it5, "it");
                int i4 = i2 + 1;
                if (l == null) {
                    it5.bindNull(i4);
                } else {
                    it5.bindLong(i4, l.longValue());
                }
                return unit;
            case 4:
                return LazyGridState.prefetchState$lambda$0((LazyGridState) obj2, i2, (NestedPrefetchScope) obj);
            case 5:
                return LazyListState.prefetchState$lambda$0((LazyListState) obj2, i2, (NestedPrefetchScope) obj);
            case 6:
                NewPremiumBusReserveTicketActivationState it6 = (NewPremiumBusReserveTicketActivationState) obj;
                Intrinsics.i(it6, "it");
                return NewPremiumBusReserveTicketActivationState.a(it6, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, false, null, null, new PBStopDetailsZoomedImageState.Show((ArrayList) obj2, i2), null, null, null, -1, 30);
            case 7:
                QRValidationDataState qRValidationDataState = (QRValidationDataState) obj;
                return QRValidationDataState.a(qRValidationDataState, null, false, null, null, 0L, 0L, QRValidationComponent.K0((QRValidationComponent) obj2, qRValidationDataState.g, i2), null, null, null, false, false, null, null, null, false, false, 131007);
            default:
                return Boolean.valueOf(SnapshotStateList.addAll$lambda$0(i2, (Collection) obj2, (List) obj));
        }
    }

    public /* synthetic */ k4(Context context, TimeoutInterceptor timeoutInterceptor, int i) {
        this.f17462a = 0;
        this.c = timeoutInterceptor;
        this.b = i;
    }

    public /* synthetic */ k4(Object obj, int i, int i2) {
        this.f17462a = i2;
        this.c = obj;
        this.b = i;
    }
}
