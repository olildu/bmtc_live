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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ChaloCardActivePass;", "", "Companion", "Lapp/chalo/ncmc/data/appmodel/ClosedCardActivePassAppModel;", "Lapp/chalo/ncmc/data/appmodel/SemiClosedCardActivePassAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public interface ChaloCardActivePass {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f6123a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ChaloCardActivePass$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/appmodel/ChaloCardActivePass;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f6123a = new Companion();

        public final KSerializer<ChaloCardActivePass> serializer() {
            SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.ncmc.data.appmodel.ChaloCardActivePass", Reflection.a(ChaloCardActivePass.class), new KClass[]{Reflection.a(ClosedCardActivePassAppModel.class), Reflection.a(SemiClosedCardActivePassAppModel.class)}, new KSerializer[]{ClosedCardActivePassAppModel$$serializer.f6141a, SemiClosedCardActivePassAppModel$$serializer.f6156a});
            sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
            return sealedClassSerializer;
        }
    }

    /* JADX INFO: renamed from: a */
    String getG();

    /* JADX INFO: renamed from: b */
    Long getB();

    /* JADX INFO: renamed from: c */
    Integer getD();

    /* JADX INFO: renamed from: d */
    Integer getE();

    /* JADX INFO: renamed from: e */
    Integer getC();

    /* JADX INFO: renamed from: getName */
    String getF6155a();
}
