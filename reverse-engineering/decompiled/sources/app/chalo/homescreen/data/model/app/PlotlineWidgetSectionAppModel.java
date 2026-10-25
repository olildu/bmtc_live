package app.chalo.homescreen.data.model.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/PlotlineWidgetSectionAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PlotlineWidgetSectionAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3776a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/PlotlineWidgetSectionAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/PlotlineWidgetSectionAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PlotlineWidgetSectionAppModel> serializer() {
            return PlotlineWidgetSectionAppModel$$serializer.f3777a;
        }
    }

    public /* synthetic */ PlotlineWidgetSectionAppModel(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(PlotlineWidgetSectionAppModel$$serializer.f3777a.getDescriptor(), i, 15);
            throw null;
        }
        this.f3776a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlotlineWidgetSectionAppModel)) {
            return false;
        }
        PlotlineWidgetSectionAppModel plotlineWidgetSectionAppModel = (PlotlineWidgetSectionAppModel) obj;
        return Intrinsics.d(this.f3776a, plotlineWidgetSectionAppModel.f3776a) && Intrinsics.d(this.b, plotlineWidgetSectionAppModel.b) && Intrinsics.d(this.c, plotlineWidgetSectionAppModel.c) && Intrinsics.d(this.d, plotlineWidgetSectionAppModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f3776a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return r30.i(dd.e("PlotlineWidgetSectionAppModel(title=", this.f3776a, ", header=", this.b, ", desc="), this.c, ", plotlineWidgetId=", this.d, ")");
    }

    public PlotlineWidgetSectionAppModel(String str, String str2, String str3, String str4) {
        this.f3776a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
