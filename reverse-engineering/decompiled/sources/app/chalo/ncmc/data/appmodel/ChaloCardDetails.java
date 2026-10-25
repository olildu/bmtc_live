package app.chalo.ncmc.data.appmodel;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ChaloCardDetails;", "", "Companion", "Lapp/chalo/ncmc/data/appmodel/ClosedCardDetailsAppModel;", "Lapp/chalo/ncmc/data/appmodel/OpenCardDetailsAppModel;", "Lapp/chalo/ncmc/data/appmodel/SemiClosedCardDetailsAppModel;", "Lapp/chalo/ncmc/data/appmodel/UnknownCardDetailsAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public interface ChaloCardDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f6124a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ChaloCardDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/appmodel/ChaloCardDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f6124a = new Companion();

        public final KSerializer<ChaloCardDetails> serializer() {
            SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.ncmc.data.appmodel.ChaloCardDetails", Reflection.a(ChaloCardDetails.class), new KClass[]{Reflection.a(ClosedCardDetailsAppModel.class), Reflection.a(OpenCardDetailsAppModel.class), Reflection.a(SemiClosedCardDetailsAppModel.class), Reflection.a(UnknownCardDetailsAppModel.class)}, new KSerializer[]{ClosedCardDetailsAppModel$$serializer.f6143a, OpenCardDetailsAppModel$$serializer.f6152a, SemiClosedCardDetailsAppModel$$serializer.f6158a, UnknownCardDetailsAppModel$$serializer.f6162a});
            sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
            return sealedClassSerializer;
        }
    }

    /* JADX INFO: renamed from: a */
    Boolean getH();

    /* JADX INFO: renamed from: b */
    String getF6161a();

    Integer c();

    /* JADX INFO: renamed from: d */
    Long getE();

    /* JADX INFO: renamed from: e */
    boolean getB();

    /* JADX INFO: renamed from: f */
    Boolean getJ();

    /* JADX INFO: renamed from: g */
    Long getC();

    /* JADX INFO: renamed from: getType */
    String getD();

    /* JADX INFO: renamed from: h */
    Boolean getI();
}
