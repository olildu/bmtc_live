package defpackage;

import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.window.layout.WindowMetricsCalculator;
import app.cash.sqldelight.db.SqlPreparedStatement;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.serializers.YearMonthComponentSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.ShortSerializer;
import okio.internal.ZipEntry;
import org.jetbrains.compose.resources.vector.xmldom.Element;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yp1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20133a;

    public /* synthetic */ yp1(int i) {
        this.f20133a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f20133a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                return ((WindowInsetsHolder) obj).getSafeDrawing();
            case 1:
                return ((WindowInsetsHolder) obj).getCaptionBar();
            case 2:
                return ((WindowInsetsHolder) obj).getWaterfall();
            case 3:
                return ((WindowInsetsHolder) obj).getStatusBars();
            case 4:
                return WindowMetricsCalculator.Companion.reset$lambda$1((WindowMetricsCalculator) obj);
            case 5:
                return WindowMetricsCalculator.Companion.decorator$lambda$0((WindowMetricsCalculator) obj);
            case 6:
                Element it = (Element) obj;
                Intrinsics.i(it, "it");
                return Boolean.valueOf(it.getNodeName().equals("item"));
            case 7:
                ClassSerialDescriptorBuilder buildClassSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
                SerialDescriptorImpl serialDescriptorImpl = YearMonthComponentSerializer.f18078a;
                Intrinsics.i(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                EmptyList emptyList = EmptyList.f17557a;
                IntSerializer intSerializer = IntSerializer.f18146a;
                buildClassSerialDescriptor.a("year", IntSerializer.b, emptyList, false);
                ShortSerializer shortSerializer = ShortSerializer.f18169a;
                buildClassSerialDescriptor.a("month", ShortSerializer.b, emptyList, false);
                return unit;
            case 8:
                Intrinsics.i((ZipEntry) obj, "it");
                return Boolean.TRUE;
            case 9:
                SqlPreparedStatement executeQuery = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery, "$this$executeQuery");
                executeQuery.bindString(0, null);
                return unit;
            default:
                SqlPreparedStatement executeQuery2 = (SqlPreparedStatement) obj;
                Intrinsics.i(executeQuery2, "$this$executeQuery");
                executeQuery2.bindString(0, null);
                return unit;
        }
    }
}
